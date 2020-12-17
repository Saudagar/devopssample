FROM openjdk:latest

ADD target/springboot-docker.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080