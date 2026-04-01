FROM maven:3.8.1-jdk-8 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:8-jre
WORKDIR /app
COPY --from=build /app/target/bank-api.jar app.jar

# --- INTHA LINE MATTUM ADD PANNUNGA ---
# Default-aa 'Primary' nu irukum, namma Pipeline-la ithai maathikalam
ENV REGION_NAME="Cloud Cluster" 

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
