**WeatherAppFeign** is a Spring Boot application that fetches weather information based on the city name using Feign Client.

## Project Structure
- **client**: Contains Feign Client definitions.
- **config**: Configuration files, including CORS settings.
- **controller**: REST Controller for handling weather queries.
- **dto**: Data Transfer Objects (DTOs) for response mapping.
- **service**: Service layer for business logic and API calls.

## Technologies Used
- **Java 17+**
- **Spring Boot**
- **Feign Client**
- **Gradle** (for build and dependency management)

## API Usage
- **Endpoint: /v1/weather/{city}**
- **Method: GET**
- **Path Variable: city (Name of the city for which you want weather data)**
