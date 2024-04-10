FROM openjdk:21-jdk
EXPOSE 8080
ARG JAR_FILE=gateway-1.jar
ADD ${JAR_FILE} gateway-1.jar
ENTRYPOINT ["java","-jar","/gateway-1.jar"]