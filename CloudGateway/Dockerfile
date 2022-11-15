FROM openjdk:17

ARG JAVA_JAR=target/*.jar

COPY ${JAVA_JAR} cloudgateway.jar

ENTRYPOINT ["java", "-jar", "/cloudgateway.jar"]

EXPOSE 9090