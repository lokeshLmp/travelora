FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
COPY src ./src

RUN chmod +x mvnw && ./mvnw clean package -DskipTests

EXPOSE 8081

CMD ["java", "-jar", "target/booking-service-0.0.1-SNAPSHOT.jar"]