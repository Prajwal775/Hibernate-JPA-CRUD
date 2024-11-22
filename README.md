# **Hibernate-JPA-CRUD**

This repository demonstrates essential CRUD operations using Hibernate and JPA with Spring Boot. It covers various aspects of database interaction, including object-relational mapping, annotations, and auto-configuration. This project is ideal for beginners and intermediate developers who want to deepen their understanding of Hibernate and JPA.

## Project Overview

This repository is a collection of Hibernate and JPA concepts implemented with Spring Boot. It includes:  
- Hibernate/JPA Overview  
- Hibernate, JPA, and JDBC integration  
- Setting up development environment and database tables  
- Spring Boot project setup for JPA  
- JPA annotations (overview and coding)  
- CRUD operations:  
  - Saving Java objects to the database  
  - Reading objects from the database  
  - Querying objects using JPA  
  - Updating objects in the database  
  - Deleting objects from the database  
- Creating database tables from Java code using annotations  
- Auto-configuration for seamless integration  

## Repository Contents

- `00-starter-sql-scripts`: Starter SQL scripts for initial database setup  
- `01-CrudDemo-student`: Basic CRUD operation examples with a `Student` entity  
- `02-read-object-using-jpa`: Examples for reading objects using JPA  
- `03-query-objects-using-jpa`: Querying objects using custom queries  
- `04-findall-query-objects-using-jpa`: Finding all objects in a database  
- `05-findbylastname-query-objects-using-jpa`: Querying objects based on specific criteria  
- `06-update-objects-using-jpa`: Updating existing database records  
- `07-delete-objects-using-jpa`: Deleting records from the database  
- `08-cruddemo-automatic-creation-d`: Demonstration of automatic table creation using JPA annotations  

## Technologies Used

- **Java**: Programming Language  
- **Spring Boot**: Framework for Hibernate and JPA applications  
- **Hibernate**: ORM framework for mapping Java objects to database tables  
- **JPA**: Java Persistence API for database operations  
- **MySQL**: Relational database for storing and querying data  
- **Maven**: Build and dependency management tool  

## Usage

1. Clone this repository:  
2. Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).  
3. Update the database configuration in `application.properties` with your MySQL credentials.  
4. Run the Spring Boot application.  
5. Use the endpoints to perform CRUD operations as defined in the repository examples.  

## Topics Explored

- Setting up the development environment  
- Configuring database tables  
- Using JPA annotations for ORM mapping  
- CRUD operations with JPA  
- Creating tables from Java code automatically  
- Best practices for Hibernate and JPA integration  

## Contributing

Contributions are welcome! If you want to add more examples or improve existing ones, feel free to submit a pull request.  

## License

This project is licensed under the MIT License. See the LICENSE file for details.
