FROM openjdk:8
LABEL maintainer="pinalp887@gmail.com"
VOLUME /temp
EXPOSE 2222
ARG JAR_FILE=target/microservice-orders-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} microservice-orders-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "microservice-orders-0.0.1-SNAPSHOT.jar"]