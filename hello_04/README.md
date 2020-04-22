spring依赖注入构造
================

Dependency Injection 依赖注入

https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring

使用spring xml方式描述依赖注入关系

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