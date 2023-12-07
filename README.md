# Microservices Communication Example with Feign

This project demonstrates communication between two microservices using Feign clients. The microservices, named `client-service` and `voiture-service`, communicate with each other to retrieve data related to clients and their associated cars.

## Project Structure
## Architecture :
<img width="645" alt="288760258-06d2e97a-b5cb-4d6f-ae43-f1ba6f7381c8" src="https://github.com/akramfgr/microservices_feignCommunication/assets/101585977/e6e4006c-57ab-4bf1-9632-8a7aac8220a8">

The project is divided into two microservices and a gateway:

1. **Client Service (client-service)**
   - Exposes REST endpoints related to clients.
   - Utilizes Feign to communicate with the Voiture Service.

2. **Voiture Service (voiture-service)**
   - Manages data related to cars (voitures).
   - Exposes REST endpoints to retrieve car data based on client ID.

3. **Gateway**
   - Routes requests to the appropriate microservices.
   - Rewrite paths for clean URL structure.

## Technologies Used

- Spring Boot
- Feign (for declarative REST client)
- Eureka (for service registration and discovery)
- Spring Cloud Gateway

## Running the Application

### Prerequisites

- Java 11 or higher
- Maven
- Docker (optional)

### Steps

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/yourusername/microservices-feign-example.git
    ```

2. **Run Eureka Server:**

    Navigate to the `eureka-server` directory and run:

    ```bash
    cd eureka-server
    mvn spring-boot:run
    ```

3. **Run Client Service:**

    Navigate to the `client-service` directory and run:

    ```bash
    cd client-service
    mvn spring-boot:run
    ```

4. **Run Voiture Service:**

    Navigate to the `voiture-service` directory and run:

    ```bash
    cd voiture-service
    mvn spring-boot:run
    ```

5. **Run Gateway:**

    Navigate to the `gateway` directory and run:

    ```bash
    cd gateway
    mvn spring-boot:run
    ```


## Usage

- Use the provided REST endpoints to interact with the microservices.
- Explore the code in each microservice for detailed implementation.

