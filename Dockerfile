FROM openjdk:21-jdk
EXPOSE 8080
ARG JAR_FILE=gateway-1.war
ADD ${JAR_FILE} gateway-1.war
ENTRYPOINT ["java","-jar","/gateway-1.war"]