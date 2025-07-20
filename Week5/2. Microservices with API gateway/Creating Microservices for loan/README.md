# Loan Service (Spring Boot + MySQL + Swagger)

## Port: 8082
## Database: loan_db

### Features:
- REST API with GET/POST for Loan
- Swagger UI: http://localhost:8082/swagger-ui.html

### Endpoints:
- GET /loan/all
- POST /loan/add

### Setup Instructions:
1. Create the `loan_db` database in MySQL.
2. Update application.properties with your MySQL username/password.
3. Run the service using your IDE or:
```
./mvnw spring-boot:run
```