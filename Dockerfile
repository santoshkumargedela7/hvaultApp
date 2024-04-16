FROM openjdk:17
volume /tmp
copy /target/hvaultApp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java" ,"-jar", "/app.jar"]