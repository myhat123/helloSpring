注解
===

https://github.com/LingCoder/OnJava8/blob/master/docs/book/23-Annotations.md

现代java框架，第三方包中，都含有大量的注解，用于替代原有的xml配置

```bash
mkdir -p ./src/main/java
mkdir -p ./build/classes/java/main

javac -d ./build/classes/java/main ./src/main/java/*.java

java -classpath ./build/classes/java/main:. UseCaseTracker
```