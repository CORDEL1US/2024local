FROM openjdk:17
WORKDIR /apps/
COPY ./build/libs/backend-api-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "/apps/backend-api-0.0.1-SNAPSHOT.jar"]