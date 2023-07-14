# GreenStitch Assignment

 GreenStitch Assignment is a sample project demonstrating how to implement JWT (JSON Web Token) authentication in a web application. It provides a basic setup for handling user authentication using JWT tokens.

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JSON Web Tokens (JWT)
- H2 Database
- Maven

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository:

   ```
   git clone
   ```
2. Navigate to the project directory:
   ```
   cd GreenStitch
   ```
3. Build the project:
   ```
   mvn clean install
   ```
4. Run the application:
```
mvn spring-boot:run
````

Replace `<JWT_TOKEN>` with the actual JWT token received after successful authentication.

## Configuration

The application's configuration can be found in the `application.properties` file. You can modify the following properties:

- `spring.datasource.url`: JDBC URL for the H2 database.
- `spring.datasource.username`: Database username.
- `spring.datasource.password`: Database password.
- `jwt.secret`: Secret key used for JWT token generation and verification.
- `jwt.expirationMs`: Expiration time for the JWT token in milliseconds.
