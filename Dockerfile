FROM maven:3.8.1-jdk-8 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:8-jre-slim
WORKDIR /app
# stage 1-la irundhu target kulla irukura jar-ah copy panrom
COPY --from=build /app/target/bank-api.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
