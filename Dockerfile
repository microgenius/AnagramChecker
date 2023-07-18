# Use an official Maven image as the base
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml .

# Download project dependencies
RUN mvn dependency:go-offline

# Copy the source code to the container
COPY src ./src

# Build the project
RUN mvn package

# Use an OpenJDK runtime image as the base for the final image
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the build image to the final image
COPY --from=build /app/target/anagram-checker-1.0-SNAPSHOT.jar .

# Run the Java program with two words as arguments
ENTRYPOINT ["java", "-jar", "anagram-checker-1.0-SNAPSHOT.jar"]
CMD ["word1", "word2"]