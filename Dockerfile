FROM openjdk:latest

COPY target/cvtheque-backend-0.0.1-SNAPSHOT.war root.war

ENTRYPOINT ["java","-jar","/root.war"]
