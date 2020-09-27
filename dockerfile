FROM openjdk:8-jre-alpine

MAINTAINER "NAME- AVESH YADAV, Email- boosteravesh@gmail.com"
 
WORKDIR /app
EXPOSE 9090
COPY springboot-docker/target/SpringBootDocker-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "SpringBootDocker-0.0.1-SNAPSHOT.jar"]
