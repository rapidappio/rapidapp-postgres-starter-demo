
# Rapidapp Postgres Starter Demo

This project demonstrates how easy it is to spin up a Spring Boot application with Rapidapp Starter. Rapidapp Starter sets up a PostgreSQL database on the Rapidapp SaaS platform and configures the datasource with the necessary credentials.

### Features
- Automatic PostgreSQL database creation on Rapidapp
- Pre-configured datasource for seamless integration
- Demonstrates best practices for Spring Boot and PostgreSQL integration

### Prerequisites
- Java 17 or higher
- Maven or Gradle
- Rapidapp account

### Rapidapp Postgres Database
Create a free database on Rapidapp [here](https://app.rapidapp.io/?ref=github_rapidapp-postgres-starter-demo)

### Running Application
```bash
RAPIDAPP_POSTGRES_API_KEY=<api_key> ./mvnw spring-boot:run
```
