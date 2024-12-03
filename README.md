# Student Management System - Spring Boot REST API!

![springio-icon](https://github.com/user-attachments/assets/078c0554-f711-4788-8deb-4687263424a0)

This is a **Student Management System** built using **Spring Boot** to efficiently manage student records. The project implements a **RESTful API** that allows users to perform **CRUD** (Create, Read, Update, Delete) operations on student data.

## Key Features:
- **Student Records Management**: Add, update, delete, and view student details.
- **REST API Endpoints**: Exposes endpoints for managing student data.
- **Spring Boot**: Leverages the power of the Spring Framework for fast development and easy scalability.
- **Database Integration**: Store and retrieve student data using a relational database (e.g., H2 or MySQL).
- **CRUD Operations**: Full support for basic CRUD functionalities.
- **Clean Architecture**: Follows best practices for backend development with clear separation of concerns.

## Technologies Used:
- **Java 17+**
- **Spring Boot** (v2.x)
- **Spring Data JPA**
- **REST API** (with JSON responses)
- **H2/MySQL** (Database)

## Setup & Installation:
### Prerequisites:
- JDK 1.8+ installed.
- Maven or Gradle for building the project.
- Database (H2/MySQL) setup.

### Steps to run the project:
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   Configure your database settings in application.properties:

2.properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=root
Build and run the application:

3. Build and Run
mvn spring-boot:run

4.The application will be available at:
http://localhost:8080

## API Endpoints: (http:/localhost:8080/endpoints)
### 1. Create a New Student
Endpoint: POST /students
Description: Create a new student record.
Request Body:
json
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "course": "Computer Science"
}
```
### 2. Get All Students
Endpoint: GET /students
Description: Retrieve a list of all students.

### 3. Get Student by ID
Endpoint: GET /students/{id}
Description: Retrieve a specific student by ID.

### 4. Update Student by ID
Endpoint: PUT /students/{id}
Description: Update an existing student record by ID.

### 5. Delete Student by ID
Endpoint: DELETE /students/{id}
Description: Delete a student record by ID.

