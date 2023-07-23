FROM openjdk:17
COPY ./target /usr/target
CMD ["java", "-jar", "/usr/target/aws-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080