spring依赖注入构造
================

Dependency Injection 依赖注入

https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring

使用 spring annotation + xml 方式描述依赖注入关系

```bash
mkdir -p ./build/classes/java/main

javac -d ./build/classes/java/main -cp ./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:libs/spring-beans-5.2.5.RELEASE.jar:. ./src/main/java/*.java

cp ./src/main/resources/applicationContext.xml ./build/classes/java/main
```

运行时连续碰到ClassNotFound错误，需要逐步增加一堆的spring jar包

```bash
java -classpath ./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:./libs/spring-beans-5.2.5.RELEASE.jar:./libs/spring-aop-5.2.5.RELEASE.jar:./libs/commons-logging-1.2.jar:./libs/spring-expression-5.2.5.RELEASE.jar:./build/classes/java/main:. App
```

下载jar包
========

spring-context-5.2.5.RELEASE.jar  
spring-core-5.2.5.RELEASE.jar  
spring-beans-5.2.5.RELEASE.jar  
spring-aop-5.2.5.RELEASE.jar  
spring-expression-5.2.5.RELEASE.jar  

commons-logging-1.2.jar

说明
===

```java
public class Store {

    @Autowired
    private Item item;

    @Override
    public String toString() {
        return "Dependency Injection 初始化 item, " + this.item.toString();
    }
}
```

这里Autowired，Store没有构造方法、set方法  

In case of Field-Based DI, we can inject the dependencies by marking them with an @Autowired 

While constructing the Store object, if there's no constructor or setter method to inject the Item bean, the container will use reflection to inject Item into Store.

文中这样描述，容器通过反射把Item注入到Store中

This approach might look simpler and cleaner but is not recommended to use because it has a few drawbacks such as:

This method uses reflection to inject the dependencies, which is costlier than constructor-based or setter-based injection
It's really easy to keep adding multiple dependencies using this approach. If you were using constructor injection having multiple arguments would have made us think that the class does more than one thing which can violate the Single Responsibility Principle.

这个方法，简单清晰，但是不推荐使用，因为它存在缺点：
1. 这个方法会使用反射注入依赖，运行消耗要多一些
2. 构造方法有多个参数，可能就存在冲突

By default, the container creates and configures all singleton beans during initialization. To avoid this, you can use the lazy-init attribute with value true on the bean configuration:

```xml
<bean id="item1" class="org.baeldung.store.ItemImpl1" lazy-init="true" />
```