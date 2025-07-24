## Stage 1: Build and Package
FROM nexus.bps.net:5000/maven:3.9.6-eclipse-temurin-21 as builder

ARG NEXUS_USER
ARG NEXUS_PASSWORD

WORKDIR /app

# BPS Certificates
COPY --from=nexus.bps.net:5000/devops/certs:latest /certs/cacerts .

COPY ci/maven/settings.xml .
COPY pom.xml .

RUN mvn -B -s settings.xml dependency:go-offline -Djavax.net.ssl.trustStore=cacerts

COPY src src
RUN mvn -B -s settings.xml clean package -Djavax.net.ssl.trustStore=cacerts

# Stage 2 : Sonnar Scanner
FROM builder as scanner
 
# Copy git files for sonarqube scanner
COPY .git/ ./.git/
COPY .gitignore .

## Stage 3: Package Image
FROM nexus.bps.net:5000/ubi9/openjdk-21-runtime:1.20

# Timezone Montevideo
ENV TZ="America/Montevideo"

COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
