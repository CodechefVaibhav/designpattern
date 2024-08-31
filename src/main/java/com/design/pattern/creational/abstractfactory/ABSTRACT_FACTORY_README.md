# Document Management System Using Abstract Factory Design Pattern with Spring ApplicationContext

## Overview
This project demonstrates the implementation of the Abstract Factory Design Pattern in a Spring Boot application, enhanced by using the Spring `ApplicationContext` to manage the creation of document objects. The example used is a Document Management System where different types of documents (e.g., PDF, Word) need to be created and processed.

## What is the Abstract Factory Design Pattern?
The Abstract Factory Design Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It encapsulates the creation of a set of related objects, allowing for flexibility in choosing the specific implementation at runtime.

## How is it Different from the Factory Design Pattern?
- **Factory Design Pattern**: Creates a single object, and it is responsible for instantiating specific classes.
- **Abstract Factory Design Pattern**: Creates families of related objects, encapsulating the creation of multiple objects and allowing for consistency among them.

### When to Prefer One Over Another?
- Use the **Factory Design Pattern** when you only need to create one object and don't need to manage multiple related objects.
- Use the **Abstract Factory Design Pattern** when you need to create multiple related objects that must be used together.

### Pros and Cons of the Abstract Factory Design Pattern

#### Pros
- **Flexibility**: Decouples client code from the specific classes it needs to instantiate.
- **Consistency**: Ensures that related objects are always used together.
- **Maintainability**: Makes it easier to manage and extend code by isolating the creation logic.
- **Spring Integration**: Leveraging Spring’s `ApplicationContext` ensures that object creation is managed according to Spring's lifecycle, benefiting from dependency injection, AOP, and other features.

#### Cons
- **Complexity**: Introduces additional complexity by adding more classes and interfaces.
- **Overhead**: May lead to unnecessary abstraction if only a few objects need to be created.

## cURL Commands for Testing

### Process PDF Document
```bash
curl -X GET http://localhost:8080/documents/process-pdf
