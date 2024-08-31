FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/serviceA-0.0.1-SNAPSHOT.jar
#COPY target/serviceA-0.0.1-SNAPSHOT.jar app.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]