# Currency-services
 This Spring Boot project includes four microservices: Currency Conversion, Currency Exchange, API Gateway, and Naming Server## Getting Started

This Spring Boot project includes four Maven-based microservices: Currency Conversion, Currency Exchange, API Gateway, and Naming Server.

Currency Conversion Service: Converts currencies based on the latest exchange rates, accepting source currency, target currency, and amount to return the converted amount.

Currency Exchange Service: Provides currency exchange functionality, managing exchange rates and allowing users to exchange amounts between currencies.

API Gateway: Serves as the entry point for client requests, routing them to the appropriate microservices and handling cross-cutting concerns like authentication and rate limiting.

Naming Server: Implemented using Eureka, provides service discovery and registration, enabling dynamic communication between microservices.

### Setup Instructions:

Build the project: mvn clean install

Run the microservices:

Currency Conversion Service: mvn spring-boot:run -pl currency-conversion-service
Currency Exchange Service: mvn spring-boot:run -pl currency-exchange-service
API Gateway: mvn spring-boot:run -pl api-gateway
Naming Server: mvn spring-boot:run -pl naming-server
Access the services:

Currency Conversion Service: http://localhost:8080
Currency Exchange Service: http://localhost:8081
API Gateway: http://localhost:8765
Naming Server: http://localhost:8761
Notes:

Configure application properties for each microservice according to your environment and requirements.
The API Gateway routes requests and handles common concerns like authentication.
The Naming Server enables microservices to discover and communicate using service names.



 
