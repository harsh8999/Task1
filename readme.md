# Student Management System

This Spring Boot application provides a simple Student Management System with basic operations using a HashMap as an in-memory data store.

## Getting Started

### Prerequisites

Make sure you have Java and Maven installed on your machine.

### Running the Application

1. Clone the repository:

    ```bash
    git clone https://github.com/harsh8999/Task1.git 
    ```

2. Build and run the application:

    ```bash
    ./mvnw spring-boot:run
    ```

    The application will be accessible at [http://localhost:8080](http://localhost:8080).

## API Endpoints

### Add a new student

- **Endpoint:** `POST /student`
- **Request Body:**
  ```json
  {
    "id": 1,
    "name": "Harsh Nayak"
  }

- **Response:**
  ```json
  {
    "id": 1,
    "name": "Harsh Nayak"
  }

### Get a student

- **Endpoint:** `GET /student/{id}`
- **Response:**
  ```json
  {
    "id": 1,
    "name": "Harsh Nayak"
  }


### Testing
    The project includes unit tests to ensure the correctness of the service and controller logic. Run the tests using:
```bash
./mvnw test
