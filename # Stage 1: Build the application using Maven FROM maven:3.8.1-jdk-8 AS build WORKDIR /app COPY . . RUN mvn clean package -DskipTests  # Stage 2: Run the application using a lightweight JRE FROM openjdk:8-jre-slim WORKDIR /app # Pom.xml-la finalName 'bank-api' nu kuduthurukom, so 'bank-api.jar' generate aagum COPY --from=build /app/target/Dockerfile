# Stage 1: Build the application using Maven
FROM maven:3.8.1-jdk-8 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the application using a lightweight JRE
FROM openjdk:8-jre-slim
WORKDIR /app
# Pom.xml-la finalName 'bank-api' nu kuduthurukom, so 'bank-api.jar' generate aagum
COPY --from=build /app/target/bank-api.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
