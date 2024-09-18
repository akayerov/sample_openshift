FROM openjdk:17-slim
COPY sample1-0.0.1-SNAPSHOT.jar /usr/local/lib/sample1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/sample1-0.0.1-SNAPSHOT.jar"]
