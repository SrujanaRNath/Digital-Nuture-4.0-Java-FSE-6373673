# Customer Service (Spring Boot + MySQL + Swagger)

## Port: 8081
## Database: account_db

### Features:
- REST API with GET/POST for Customer
- Swagger UI: http://localhost:8081/swagger-ui.html

### Endpoints:
- GET /account/all
- POST /account/add

### Setup Instructions:
1. Create the `account_db` database in MySQL.
2. Update application.properties with your MySQL username/password.
3. Run the service using your IDE or:
```
./mvnw spring-boot:run
```