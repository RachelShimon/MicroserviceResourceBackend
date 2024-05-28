# Microservice Resource Backend

This project is a simple backend application built for managing resources and microservices. It provides endpoints to retrieve resources and microservices data stored in JSON files. The application is built using the Spring Boot framework.

## Technologies Used

- **Spring Boot:** Java-based framework for building web applications.
- **Lombok:** Java library that helps to reduce boilerplate code.
- **Jackson:** Java library for JSON serialization and deserialization.
- **Gradle:** Dependency management and build tool for Java projects.

## Description

The project consists of the following components:

- **Controllers:** Contains REST controllers to handle HTTP requests.
- **Models:** Defines the data models used in the application.
- **Services:** Implements the business logic to retrieve data from JSON files.
- **Resources:** JSON files storing resource and microservice data.

## Installation and Setup

### Prerequisites

- Java Development Kit (JDK)
- Gradle

### Clone the Repository
  ```sh
   git clone https://github.com/RachelShimon/MicroserviceResourceBackend.git
   ```

### Build and Run the Project

1. **Build the Project:**
     gradle build

2. **Run the Application:**


java -jar build/libs/microserviceresourcebackend.jar

The application will start running on `http://localhost:8080`.

## Endpoints

- **GET /api/resources:** Retrieves a list of resources.
- **GET /api/microservices:** Retrieves a list of microservices.

## Additional Notes

- Ensure that the JSON files `microservices.json` and `resources.json` are located in the `src/main/resources` directory.
- Cross-Origin Resource Sharing (CORS) is enabled to allow requests from different origins.

