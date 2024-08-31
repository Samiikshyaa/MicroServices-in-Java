FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/serviceB-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
#COPY target/serviceB-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]