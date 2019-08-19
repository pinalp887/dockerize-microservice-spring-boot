FROM openjdk:8
LABEL maintainer="pinalp887@gmail.com"
VOLUME /temp
EXPOSE 2222
ARG JAR_FILE= target/microservice-product-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} microservice-product-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "microservice-product-0.0.1-SNAPSHOT.jar"]