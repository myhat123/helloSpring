传统方式构造
==========

mkdir -p ./build/classes/java/main

javac -d ./build/classes/java/main ./src/main/java/*.java

java -classpath ./build/classes/java/main:. App