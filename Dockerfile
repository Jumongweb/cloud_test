FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -DskipTests

FROM openjdk:17
COPY --from=build target/*.jar cloud_test.jar
EXPOSE 5050

ENTRYPOINT ["java", "-jar", "-Dserver.port=5050", "cloud_test.jar"]