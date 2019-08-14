FROM openjdk:8
LABEL maintainer="pinalp887@gmail.com"
VOLUME /temp
EXPOSE 8762
ARG JAR_FILE=target/microservice-zull-gateway-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} microservice-zull-gateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "microservice-zull-gateway-0.0.1-SNAPSHOT.jar"]
