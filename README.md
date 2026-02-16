# 📚 Proyecto DeJSPaREST

> **Transformación de Aplicación JSP a API REST con Spring Boot**

Este proyecto implementa una API REST completa para la gestión de centros educativos, sustituyendo la tecnología JSP por servicios web modernos. Cumple con los requisitos del **RA7** del módulo profesional.

---

## 🏗️ Arquitectura del Proyecto (MVC)

La aplicación sigue estrictamente el patrón **Modelo-Vista-Controlador** orientado a servicios:

- **Modelos (`Model`)**: Entidades JPA que definen la estructura de datos y sus relaciones.
- **Repositorios (`Repository`)**: Interfaces que gestionan la persistencia de datos mediante Spring Data JPA.
- **Servicios (`Service`)**: Capa de lógica de negocio que procesa las operaciones CRUD.
- **Controladores (`Controller`)**: Endpoints RESTful que exponen la funcionalidad al cliente.

---

## 🚀 Guía de Endpoints (API)

### 🏫 1. Gestión de Materias

| Método   | Endpoint             | Acción                    |
| :------- | :------------------- | :------------------------ |
| `GET`    | `/api/materias`      | Listar todas las materias |
| `POST`   | `/api/materias`      | Crear nueva materia       |
| `PUT`    | `/api/materias/{id}` | Actualizar materia por ID |
| `DELETE` | `/api/materias/{id}` | Eliminar materia por ID   |

### 🎯 2. Resultados de Aprendizaje (RA)

| Método | Endpoint   | Acción                       |
| :----- | :--------- | :--------------------------- |
| `GET`  | `/api/ras` | Ver todos los RA             |
| `POST` | `/api/ras` | Crear RA vinculado a Materia |

### 📝 3. Criterios de Evaluación

| Método | Endpoint         | Acción                        |
| :----- | :--------------- | :---------------------------- |
| `GET`  | `/api/criterios` | Ver todos los criterios       |
| `POST` | `/api/criterios` | Crear Criterio vinculado a RA |

---

## 🛠️ Ejemplos de Payloads (JSON para Postman)

### A. Crear/Actualizar Materia (POST / PUT)

```json
{
  "nombre": "Entornos de Desarrollo",
  "curso": "1 DAM",
  "horas": 96
}
```

### B. Crear Resultado de Aprendizaje (POST)

```json
{
  "descripcion": "RA1: Reconoce los elementos de un programa",
  "ponderacion": 20.0,
  "materia": {
    "id": 1
  }
}
```

### C. Crear Criterio de Evaluación (POST)

```json
{
  "codigo": "a)",
  "descripcion": "Instala y configura el entorno de desarrollo.",
  "ra": {
    "id": 1
  }
}
```

## 💾 Acceso a Datos (H2 Database)

La aplicación utiliza una base de datos persistente en memoria para facilitar el desarrollo.

URL Consola: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:gestiondb

Credenciales: Usuario sa / Password (vacio)
