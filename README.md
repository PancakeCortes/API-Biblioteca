# API REST para Biblioteca de Libros

Este proyecto es una API REST para la gestión de una biblioteca de libros, desarrollada con Spring Boot y MongoDB.

## Tabla de Contenidos

- [Descripción](#descripción)
- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Endpoints](#endpoints)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Contribución](#contribución)
- [Licencia](#licencia)

## Descripción

Esta API REST permite gestionar libros y autores, proporcionando funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar) para ambos recursos. Además, incluye características como validación de datos, manejo global de errores, autenticación y autorización, y documentación automática.

## Requerimientos

- Java 11 o superior
- Maven
- MongoDB
- Docker (para despliegue opcional)

## Instalación

1. **Clonar el repositorio:**

   ```sh
   git clone https://github.com/tu-usuario/biblioteca-api.git
   cd biblioteca-api
Configurar la base de datos:

Asegúrate de tener MongoDB instalado y en ejecución. Puedes configurar la conexión en el archivo application.properties.

Construir el proyecto:

sh
Copiar código
mvn clean install
Ejecutar la aplicación:

sh
Copiar código
mvn spring-boot:run
Uso
Una vez que la aplicación está en funcionamiento, puedes acceder a la API en http://localhost:8080.

Endpoints
Libros
GET /libros: Obtiene una lista de todos los libros.
GET /libros/{id}: Obtiene los detalles de un libro específico por su ID.
POST /libros: Crea un nuevo libro.
PUT /libros/{id}: Actualiza un libro existente.
DELETE /libros/{id}: Elimina un libro.
Autores
GET /autores: Obtiene una lista de todos los autores.
GET /autores/{id}: Obtiene los detalles de un autor específico por su ID.
POST /autores: Crea un nuevo autor.
PUT /autores/{id}: Actualiza un autor existente.
DELETE /autores/{id}: Elimina un autor.
Tecnologías Utilizadas
Spring Boot: Framework para el desarrollo de aplicaciones Java.
Spring Data JPA: Facilita el acceso a la base de datos.
MongoDB: Base de datos NoSQL utilizada para el almacenamiento de datos.
Lombok: Biblioteca para reducir el código boilerplate.
MapStruct: Herramienta para la generación automática de mapeos entre objetos.
JUnit 5: Framework de pruebas unitarias.
Spring RestDocs: Generación automática de documentación para la API.
Docker: Plataforma de contenedores para el despliegue de la aplicación.
Jenkins: Herramienta de integración continua.
Contribución
Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos para contribuir:

Fork el repositorio
Crea una rama de característica (git checkout -b feature/nueva-caracteristica)
Commit tus cambios (git commit -am 'Añadir nueva característica')
Push a la rama (git push origin feature/nueva-caracteristica)
Abre una solicitud de extracción
