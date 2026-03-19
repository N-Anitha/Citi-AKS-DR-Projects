# Stage 1: Build (Idhu already work aagiduchi, so change venaam)
FROM maven:3.8.1-jdk-8 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run (Indha line-ah mattum maathunga)
FROM eclipse-temurin:8-jre
WORKDIR /app
COPY --from=build /app/target/bank-api.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
