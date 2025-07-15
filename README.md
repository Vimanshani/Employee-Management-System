# Employee Management System
###   An Employee Management System built with React.js, Spring Boot, and MySQL, designed to manage employee records efficiently with a modern frontend, robust backend,       and persistent data storage.


## 📂 Project Structure
  ### 1  Frontend: React.js
  
  ### 2  Backend: Spring Boot (Java)
  
  ### 3  Database: MySQL


## 🚀 Features
###   ✅ Add, update, view, and delete employee details
###   ✅ User-friendly web interface
###   ✅ RESTful API for backend communication
###   ✅ Persistent data storage using MySQL
###   ✅ Organized project structure


## 📑 Prerequisites
### Make sure you have the following installed:
####  - Node.js & npm
####  - Java JDK 11+
####  - MySQL

#### ✅ Note: This project was generated using Spring Initializr, so it includes the Maven wrapper (mvnw). You don’t need to install Maven separately.

## 🖥️ Getting Started
### 1️⃣ Clone the Repository
#### Run the following command in your terminal:
* git clone https://github.com/Vimanshani/Employee-Management-System.git
#### Then navigate into the project folder:
* cd Employee-Management-System

## ⚒️ Backend Setup
### Navigate to the backend folder (if applicable). 
####  Configure your MySQL database:
* Create a database called employee_management.

* Open the application.properties file in the backend and update it with your database credentials:
  + spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
  + spring.datasource.username=YOUR_USERNAME
  + spring.datasource.password=YOUR_PASSWORD

#### Run the Spring Boot application using the included Maven wrapper by executing:
* ./mvnw spring-boot:run

#### Once started, the backend should be accessible at:
* http://localhost:8080

## 🖥️ Frontend Setup
### Navigate to the frontend folder (if applicable).

* Install the project dependencies by running:
  + npm install

* Start the React development server by running:
  + npm start

* Once started, the frontend should be accessible at:
  + http://localhost:3000

## 📄 API Endpoints
 | Method |    Endpoint     |     Description        |
 |--------|-----------------|------------------------|
 |GET     |   /employees    | Get all employees      |
 |POST    |   /employees    | Add a new employee     |
 |PUT     | /employees/{id} | Update employee by ID  |
 |DELETE  | /employees/{id} | Delete employee by ID  |




