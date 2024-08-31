# Product Service with Builder Design Pattern

This project demonstrates the use of the Builder Design Pattern in a Spring Boot application. The example involves a `Product` entity that can be created using the Builder pattern, providing a more maintainable and flexible approach compared to traditional constructors.

## What is the Builder Design Pattern?

The Builder Design Pattern is a creational pattern that provides a way to construct complex objects step by step. It allows you to create different representations of an object using the same construction process. The pattern is particularly useful when the object to be created has multiple optional parameters.

### When to Use the Builder Pattern

- When a class has multiple parameters, especially optional ones.
- When you want to make the object creation process more readable and maintainable.
- When you want to avoid having telescoping constructors (constructors with many parameters).
- When you want to create immutable objects.

### Example Usage

In this project, a `Product` class is created using the Builder pattern. The Product class has fields like `name`, `price`, `description`, and `category`. Using the Builder pattern, you can create a `Product` object by chaining method calls in a readable and maintainable way.

### Memory Footprint Impact

The Builder pattern can slightly increase memory usage because of the additional `Builder` class and its instances. However, this is generally outweighed by the benefits in code readability and maintainability. In scenarios where many similar objects are created, the memory overhead is negligible compared to the improved code quality.

### Pros and Cons of Builder Design Pattern

**Pros:**
- Improves code readability and maintainability.
- Provides control over the object creation process.
- Supports immutability of objects.

**Cons:**
- Slight increase in memory usage due to the additional Builder class.
- More code to write and maintain compared to simple constructors.

### Example cURL Commands

Create a new Product:

```bash
curl -X POST "http://localhost:8080/products" \
-H "Content-Type: application/x-www-form-urlencoded" \
-d "name=Laptop&price=999.99&description=High-performance laptop&category=Electronics"
