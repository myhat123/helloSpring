spring分层分包机制
================

https://www.baeldung.com/spring-jdbc-jdbctemplate
http://zetcode.com/db/jdbctemplate/#cla

```bash
mkdir -p ./build/classes/java/main

javac -d ./build/classes/java/main -cp ./libs/postgresql-42.2.12.jar:./libs/spring-jdbc-5.2.5.RELEASE.jar:./libs/spring-tx-5.2.5.RELEASE.jar:./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:libs/spring-beans-5.2.5.RELEASE.jar:.:./build/classes/java/main ./src/main/java/com/mine/config/*.java ./src/main/java/com/mine/model/*.java ./src/main/java/com/mine/service/*.java ./src/main/java/com/mine/*.java
```

运行时连续碰到ClassNotFound错误，需要逐步增加一堆的spring jar包

```bash
java -classpath ./libs/postgresql-42.2.12.jar:./libs/spring-jdbc-5.2.5.RELEASE.jar:./libs/spring-tx-5.2.5.RELEASE.jar:./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:./libs/spring-beans-5.2.5.RELEASE.jar:./libs/spring-aop-5.2.5.RELEASE.jar:./libs/commons-logging-1.2.jar:./libs/spring-expression-5.2.5.RELEASE.jar:./build/classes/java/main:. com.mine.App
```

下载jar包
========

spring-context-5.2.5.RELEASE.jar  
spring-core-5.2.5.RELEASE.jar  
spring-beans-5.2.5.RELEASE.jar  
spring-aop-5.2.5.RELEASE.jar  
spring-expression-5.2.5.RELEASE.jar  
spring-jdbc-5.2.5.RELEASE.jar  
spring-tx-5.2.5.RELEASE.jar  

commons-logging-1.2.jar  
postgresql-42.2.12.jar  

说明
===

ComponentScan 扫描分离的包

```java
@Configuration
@ComponentScan("com.mine.service")
public class AppConfig {

}
```