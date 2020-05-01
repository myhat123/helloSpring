spring boot
===========

https://www.baeldung.com/spring-jdbc-jdbctemplate
http://zetcode.com/db/jdbctemplate/#boot

```bash
mkdir -p ./build/classes/java/main

javac -d ./build/classes/java/main -cp ./libs/spring-boot-2.2.5.RELEASE.jar:./libs/spring-boot-autoconfigure-2.2.5.RELEASE.jar:./libs/postgresql-42.2.12.jar:./libs/spring-jdbc-5.2.5.RELEASE.jar:./libs/spring-tx-5.2.5.RELEASE.jar:./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:libs/spring-beans-5.2.5.RELEASE.jar:.:./build/classes/java/main ./src/main/java/com/mine/config/*.java ./src/main/java/com/mine/model/*.java ./src/main/java/com/mine/service/*.java ./src/main/java/com/mine/*.java

cp ./src/main/resources/application.properties ./build/classes/java/main
```

运行时连续碰到ClassNotFound错误，需要逐步增加一堆的spring jar包

```bash
java -classpath ./libs/spring-boot-2.2.5.RELEASE.jar:./libs/spring-boot-autoconfigure-2.2.5.RELEASE.jar:./libs/HikariCP-3.4.2.jar:./libs/slf4j-api-1.7.30.jar:./libs/slf4j-log4j12-1.7.30.jar:./libs/log4j-1.2.17.jar:./libs/postgresql-42.2.12.jar:./libs/spring-jdbc-5.2.5.RELEASE.jar:./libs/spring-tx-5.2.5.RELEASE.jar:./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:./libs/spring-beans-5.2.5.RELEASE.jar:./libs/spring-aop-5.2.5.RELEASE.jar:./libs/commons-logging-1.2.jar:./libs/spring-expression-5.2.5.RELEASE.jar:./build/classes/java/main:. com.mine.Application
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

spring-boot-2.2.5.RELEASE.jar  
spring-boot-autoconfigure-2.2.5.RELEASE.jar  

HikariCP-3.4.2.jar  
slf4j-api-1.7.30.jar  
slf4j-log4j12-1.7.30.jar  
log4j-1.2.17.jar

说明
===

ComponentScan 扫描分离的包

```java
@Configuration
@ComponentScan("com.mine.service")
public class AppConfig {

}
```

DataSourceBuilder的问题
======================

https://stackoverflow.com/questions/44635962/error-when-create-datasource

In terms to use DataSourceBuilder you need to have one of the following on your classpath:

1. COMMONS-DBCP
2. TOMCAT-JDBC
3. HIKARICP

Otherwise you will get an IllegalStateException for no supported type, as you get now.

根据这个介绍，下载了hikaricp，而且连带下载了slf4j, log4j等jar包