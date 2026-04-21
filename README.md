# Microservices Task Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Spring Cloud](https://img.shields.io/badge/Spring_Cloud-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

A production-grade, cloud-ready Task Management System built with a microservices architecture using Spring Boot and Spring Cloud. Features 4 independent services — User, Task, Notification, and API Gateway — enabling independent deployment and horizontal scalability.

## Architecture

```
Client → API Gateway → User Service
                     → Task Service
                     → Notification Service
Each service has its own MySQL database (database-per-service pattern).
```

## Features

- **Microservices Architecture** — 4 independently deployable services
- **JWT Authentication** — Secured via API Gateway with role-based access control
- **Spring Security** — Secures all inter-service communication
- **Docker + docker-compose** — Fully containerized and orchestrated
- **Database per Service** — Loose coupling via isolated MySQL instances
- **35% Latency Reduction** — Service-level caching and optimized REST calls
- **Postman Collections** — All endpoints documented

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 11 |
| Framework | Spring Boot, Spring Cloud |
| Security | Spring Security, JWT |
| Database | MySQL (per-service) |
| Container | Docker, docker-compose |
| API | REST |

## Getting Started

### Prerequisites
- Java 11+
- Docker & docker-compose
- Maven

### Run Locally

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/microservices-task-management.git
cd microservices-task-management

# Start all services
docker-compose up --build
```

### API Gateway
All requests route through the API Gateway at `http://localhost:8080`.

## Project Structure

```
microservices-task-management/
├── api-gateway/
├── user-service/
├── task-service/
├── notification-service/
├── docker-compose.yml
└── README.md
```

## Author

**Yashraj Parmar**  
[LinkedIn](https://linkedin.com/in/yashraj-parmar) | yashrajparmar9321@gmail.com# microservices-task-management
