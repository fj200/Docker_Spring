# Use a base image with JDK 17 (or the version you're using)
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the built application JAR file to the container
COPY target/BloggingAPI-0.0.1-SNAPSHOT.jar /app/blog-application.jar

# Expose the port on which the application will run
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "blog-application.jar"]
