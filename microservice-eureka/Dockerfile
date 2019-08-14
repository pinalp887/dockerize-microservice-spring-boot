FROM openjdk:8
LABEL maintainer="pinalp887@gmail.com"
VOLUME /temp
EXPOSE 8761
ARG JAR_FILE=target/microservice-eureka-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} microservice-eureka-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "microservice-eureka-0.0.1-SNAPSHOT.jar"] 
