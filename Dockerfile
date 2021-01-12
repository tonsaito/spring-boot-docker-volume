FROM openjdk:11.0.4-jre-slim

ENV JARFILE app.jar


CMD java -jar /jars/${JARFILE}