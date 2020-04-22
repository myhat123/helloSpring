@Autowired注解
=============

https://www.baeldung.com/spring-dependency-injection  
https://www.baeldung.com/spring-autowire

```bash
mkdir -p ./build/classes/java/main

javac -d ./build/classes/java/main -cp ./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:libs/spring-beans-5.2.5.RELEASE.jar:. ./src/main/java/com/mine/hello/*.java

javac -d ./build/classes/java/main -cp ./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:libs/spring-beans-5.2.5.RELEASE.jar:.:./build/classes/java/main ./src/main/java/*.java
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
@Configuration
@ComponentScan("com.mine.hello")
public class AppConfig {

}
```

```java
@Component("fooFormatter")
public class FooFormatter {
 
    public String format() {
        return "foo";
    }
}
```

```java
@Component
public class FooService {
     
    @Autowired
    private FooFormatter fooFormatter;
 
    public String doStuff() {
        return fooFormatter.format();
    }
}
```

```java
FooService fooService = context.getBean(FooService.class);
System.out.println(fooService.doStuff());
```

从上面代码可以看出@Autowired之后，会自动初始化装配FooFormatter