# Facade Design Pattern

## What is the Facade Design Pattern?
The **Facade Design Pattern** is a structural pattern that provides a simplified interface to a complex system of classes or subsystems. It defines a higher-level interface, making the subsystem easier to interact with by hiding its complexity.

## Why Use the Facade Pattern ?
Using interfaces for both services and the facade ensures the system is flexible and adheres to the **Open/Closed Principle (OCP)** and **Dependency Inversion Principle (DIP)**. This allows the system to extend functionality without modifying existing code and makes it easy to swap out implementations.

## When to Use the Facade Design Pattern?
- **To simplify client interactions**: When interacting with multiple services or subsystems.
- **To improve flexibility**: When you expect that the business logic may change over time, making different facade implementations necessary.

### Memory Impact
Using a Facade with interfaces reduces the memory footprint by minimizing tight coupling between the client (controller) and the services. Since the controller only relies on the facade interface, it avoids loading multiple services at once, optimizing memory usage.

## Pros and Cons of the Facade Pattern

### Pros:
- **Simplifies interaction**: Reduces the complexity for clients interacting with multiple subsystems.
- **Loose Coupling**: The client only interacts with the facade interface, promoting loose coupling with the underlying system.
- **Encapsulation**: The internal details of the services or subsystems are hidden behind the facade.

### Cons:
- **Overuse of the Facade**: The facade can become a "god object" if it grows too large, trying to do too much.
- **Reduced Flexibility for Advanced Clients**: Some clients may need more direct access to the subsystems for advanced functionality, which can be hidden by the facade.

## Real-World Example: E-commerce Order Processing
In an e-commerce system, placing an order involves multiple steps:
1. Creating the order
2. Processing the payment
3. Sending a notification

The Facade Design Pattern simplifies these interactions into a single method call. In our implementation, the facade interfaces with the services responsible for each of these steps.

## cURL Commands

### Place an Order:
```bash
curl -X GET http://localhost:8080/placeOrder
