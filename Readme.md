## CRUD Application for Product and Customer Management

This is a simple Java-based CRUD application for managing **Products** and **Customers**. The application provides REST APIs using Spring Boot and can be connected to a relational database (e.g., H2, MySQL). The project demonstrates how to perform Create, Read, Update, and Delete operations on two entities: **Product** and **Customer**.

## Features

- **Product Management**
  - Create a new product
  - Retrieve a product by ID
  - Retrieve all products
  - Update an existing product
  - Delete a product by ID

- **Customer Management**
  - Create a new customer
  - Retrieve a customer by ID
  - Retrieve all customers
  - Update an existing customer
  - Delete a customer by ID

## Prerequisites

To run this application, you will need:

- **Java JDK 8 or later**
- **Maven** for dependency management and build automation
- A relational database like **H2** (in-memory) or **MySQL** (with configurations)
- An IDE like **IntelliJ IDEA** or **Eclipse** for development

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           ├── controller/
│   │           │   ├── ProductController.java
│   │           │   ├── CustomerController.java
│   │           ├── model/
│   │           │   ├── Product.java
│   │           │   ├── Customer.java
│   │           ├── repository/
│   │           │   ├── ProductRepository.java
│   │           │   ├── CustomerRepository.java
│   │           ├── service/
│   │           │   ├── ProductService.java
│   │           │   ├── CustomerService.java
│   │           └── CrudApplication.java
│   └── resources/
│       ├── application.properties
└── test/
    └── java/
```

## API Endpoints

### Product APIs

- **Create a new product**  
  `POST /api/products`  
  **Request body** (JSON):
  ```json
  {
    "name": "Product A",
    "price": 100.0,
    "description": "Description of Product A"
  }
  ```

- **Get all products**  
  `GET /api/products`

- **Get a product by ID**  
  `GET /api/products/{id}`

- **Update a product by ID**  
  `PUT /api/products/{id}`  
  **Request body** (JSON):
  ```json
  {
    "name": "Updated Product",
    "price": 150.0,
    "description": "Updated description"
  }
  ```

- **Delete a product by ID**  
  `DELETE /api/products/{id}`

### Customer APIs

- **Create a new customer**  
  `POST /api/customers`  
  **Request body** (JSON):
  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
  }
  ```

- **Get all customers**  
  `GET /api/customers`

- **Get a customer by ID**  
  `GET /api/customers/{id}`

- **Update a customer by ID**  
  `PUT /api/customers/{id}`  
  **Request body** (JSON):
  ```json
  {
    "firstName": "Jane",
    "lastName": "Doe",
    "email": "jane.doe@example.com"
  }
  ```

- **Delete a customer by ID**  
  `DELETE /api/customers/{id}`