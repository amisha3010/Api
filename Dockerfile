
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY ./target/api-0.0.1-SNAPSHOT.jar /app/api-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "api-0.0.1-SNAPSHOT.jar"]
