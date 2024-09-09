# Decorator Design Pattern

This project demonstrates the **Decorator Design Pattern** with an emphasis on the flexibility between default and custom implementations in a Spring Boot project. The `NotificationService` can be used with a default implementation or extended via custom implementations, and decorators can be applied to dynamically add responsibilities like sending SMS or Slack notifications.

## What is the Decorator Design Pattern?

The **Decorator Pattern** is a structural design pattern that allows dynamic extension of an object's functionality without modifying the original class. It works by "wrapping" an object, thereby adding new behaviors before or after method calls. This pattern adheres to the **Open/Closed Principle** (OCP), meaning that an object is open for extension but closed for modification.

### When to Use the Decorator Pattern

- **Use it** when you want to dynamically add behavior or responsibilities to objects, especially when this functionality needs to be added to multiple objects of the same interface.
- **Avoid it** when too many decorators can result in complex, hard-to-read code due to the layering of multiple decorators.
- **Memory Footprint**: Since each decorator object wraps the original object, there is some overhead in memory usage. However, this overhead is manageable and provides a clean, extensible way to add functionality.

### Default and Custom Implementations

- **Default Implementation**: The system provides a `DefaultNotificationDecoratorImprovedService` that sends basic email notifications.
- **Custom Implementation**: Users can override the default behavior by providing a `CustomNotificationDecoratorImprovedService` that delivers custom notifications.
- **Decorator Support**: Decorators can be added to either the default or custom implementations to enhance functionality, such as sending SMS or Slack notifications in addition to email.

## Pros and Cons of the Decorator Pattern

### Pros:
1. **Open for Extension, Closed for Modification**: You can add new behaviors dynamically without modifying existing code.
2. **Flexible and Reusable**: Decorators allow for greater flexibility by combining or stacking behaviors.
3. **Encapsulates Responsibilities**: Each decorator class can focus on a single responsibility.

### Cons:
1. **Increased Complexity**: Too many decorators can make the code difficult to follow and maintain.
2. **Memory Usage**: Each decorator adds a layer of abstraction, which increases memory usage, but it's generally acceptable unless many decorators are stacked.

## Example of Decorator Pattern in the Real World

In this project, we demonstrate a **notification service**. We start with a `DefaultNotificationDecoratorImprovedService` that sends email notifications. Over time, we add new notification channels like SMS or Slack without modifying the original service by wrapping it with decorators.

### Project Structure:

1. `NotificationDecoratorImprovedService`: The base interface that defines the contract for sending notifications.
2. `DefaultNotificationDecoratorImprovedService`: The default implementation that sends email notifications.
3. `CustomNotificationDecoratorImprovedService`: An alternative implementation for users who want custom notifications.
4. `SMSNotificationDecoratorImprovedDecorator`: A decorator to send SMS notifications in addition to the original notification.
5. `SlackNotificationDecoratorImprovedDecorator`: A decorator to send Slack notifications in addition to the original notification.

## cURL Commands

- Send Default Email Notification: This uses the DefaultNotificationService without any decorations.

```bash
curl -X POST http://localhost:8080/send?message=HelloWorld
```
- Send Email + SMS Notification: Using SMSNotificationDecorator on top of DefaultNotificationService:

```bash
curl -X POST http://localhost:8080/send?message=HelloWorld
```

## How It Works:

- **Default Behavior**: If you only want to send email notifications, you can use DefaultNotificationDecoratorImprovedService directly.
- **Extended Behavior**: If you want to add SMS or Slack notifications, you can add decorators (SMSNotificationDecoratorImprovedDecorator, SlackNotificationDecoratorImprovedDecorator) dynamically without modifying the original service.
- **Custom Behavior**: If you need a completely new notification mechanism, you can implement a CustomNotificationDecoratorImprovedService and still apply decorators if needed.


