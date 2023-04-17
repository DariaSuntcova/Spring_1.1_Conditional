FROM openjdk:17-jdk-slim-buster
EXPOSE 8080
ADD target/SpringBootConditional-0.0.1-SNAPSHOT.jar devapp.jar
ENTRYPOINT ["java","-jar","/devapp.jar"]



