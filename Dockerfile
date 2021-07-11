FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/instazoo-0.0.1-SNAPSHOT.jar /usr/local/lib/instazoo-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/instazoo-server-1.0.0.jar"]