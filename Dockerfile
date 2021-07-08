FROM openjdk:11-jre-slim
COPY target/instazoo-0.0.1-SNAPSHOT.jar instazoo-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/instazoo-server-1.0.0.jar"]