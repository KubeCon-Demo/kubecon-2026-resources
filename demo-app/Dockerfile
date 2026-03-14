FROM maven:3.9-amazoncorretto-25-alpine AS base

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DSkipTest


FROM maven:3.9-amazoncorretto-25-alpine AS dev
WORKDIR /app
COPY --from=base /app/target/demo.jar demo.jar

CMD ["java", "-jar", "./demo.jar"]