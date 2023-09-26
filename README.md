# demo

Box and Item Management REST API Documentation
Introduction
      This project is a Spring Boot-based REST API service for managing boxes and items. It allows clients to create boxes, load items into boxes, check loaded items for a given box, check available boxes for loading, and check the battery level for a given box. The service is designed to meet specific functional and non-functional requirements.

Prerequisites
Before getting started, make sure you have:
•	Java JDK 8 or higher
•	Maven or Gradle build tool
•	PostgreSQL database server
•	IDE (e.g., IntelliJ IDEA)
•	Postman or similar API testing tool


Getting Started
•	Clone the project repository 
•	Configure the PostgreSQL database settings
•	Build and run the Spring Boot application

API Endpoints(Examples)
•	Create a Box: ‘ POST  /api/boxes ’
•	Load Items into a Box: ‘POST  /api/boxes/{boxId}/load’
•	Check loaded items for a Box: ‘GET   /api/boxes/{boxId}/items’
•	Check available boxes for loading: ‘GET /api/boxes/available’
•	Check battery level for a box: ‘GET /api/boxes/{boxId}/battery’



Input and Output
Data is exchanged in JSON format

Functional Requirements
•	Prevent overloading boxes
•	Prevent boxes from being in LOADING state with battery levels below 25%

Non-functional Requirements
•	Developed with Java and Spring Boot
•	JSON format for data
•	A README file with build/run/test instructions
