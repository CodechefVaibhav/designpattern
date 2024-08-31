# Singleton Design Pattern Example

This project demonstrates the Singleton Design Pattern in a Spring Boot application using a manually managed singleton class `UserService` that is not dependent on Spring's `@Service` annotation. The singleton implementation is thread-safe using the `volatile` keyword.

## Problem with Non-Singleton Implementation

In the initial implementation, the `UserService` is instantiated manually within the `UserController`, leading to:

- **Multiple Instances**: Each time the controller is created, a new instance of the service is also created.
- **State Inconsistency**: Since a new service instance is created for each request, dynamically added users or roles do not persist across requests. For example, adding a user in one request does not reflect when retrieving users in another request. This can happen because each request may result in a new `UserService` instance being created, leading to the loss of any changes made in previous requests.
- **Increased Memory Usage**: Multiple instances can increase memory usage unnecessarily.

### Understanding the Request Lifecycle in Spring

In a typical Spring Boot application, the request lifecycle is short-lived, meaning that:

- **Each Request is Handled Independently**: When a client sends an HTTP request, Spring processes the request, invokes the appropriate controller, and returns a response. After the response is sent, the resources associated with the request may be released or reused.
- **Short-Lived Instances**: If services are instantiated manually within a controller, each request can create a new service instance. This results in the loss of any state (e.g., added users) once the request is completed.
- **State Inconsistency**: When the `UserService` is manually instantiated in each request, any state changes made (like adding a user) are lost because the state is tied to the short-lived service instance created for that request.

### Example of Non-Singleton Issues

To demonstrate the problem:

1. **Call `/defective/users/add?name=Charlie&roles=User`:** Adds a user named Charlie.
2. **Call `/defective/users/all`:** Expects Charlie to be listed, but he is not because a new `UserService` instance is used on each request, meaning the previous state (including added users) is lost.

In the defective code, the `UserService` is instantiated directly within the controller. Because each request to the controller can lead to the creation of a new `UserService` instance, any users added in one request are not visible in subsequent requests. This results in unpredictable behavior and loss of data.

## Solution with Manually Implemented Singleton Pattern (with Volatile)

By implementing the Singleton pattern manually in the `UserService` class, we ensure that:

- **Consistent State**: The `users` map retains all dynamically added users and roles across multiple requests and controller instances.
- **Thread-Safe Singleton**: The `volatile` keyword and double-checked locking ensure that the singleton instance is safely initialized and shared across threads.
- **Effective Use of Collections**: `Map` and `List` structures are managed within the singleton service, ensuring that data is preserved across all requests.
- **Improved Resource Management**: Only one instance of the `UserService` is created, reducing memory overhead.
- **No Spring Dependency**: The singleton is managed manually without relying on Spring's `@Service` annotation.

### Example of Singleton Solution

1. **Call `/improved/users/add?name=Charlie&roles=User`:** Adds a user named Charlie.
2. **Call `/improved/users/all`:** Charlie is listed as expected because the same `UserService` instance is used across all requests.

With the Singleton pattern, all requests share the same `UserService` instance, ensuring that any changes, such as adding new users, persist across requests.

## Running the Application

1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using `mvn spring-boot:run` or your preferred IDE.
4. Access the API at `http://localhost:8080/improved/users/all` to see all users and their roles.
5. Add a user via `http://localhost:8080/improved/users/add?name=Charlie&roles=User`.
6. Confirm the new user via `http://localhost:8080/improved/users/all`.
7. Access `http://localhost:8080/improved/users/welcome` to see a welcome message and access count.

## Conclusion

This project illustrates how the Singleton Design Pattern can be implemented manually in a Spring Boot application to manage collections like `Map` and `List`. The counterexample highlights the pitfalls of not using a singleton when managing state, and how the Singleton Pattern ensures data consistency, resource efficiency, and predictable application behavior, with thread safety ensured by using the `volatile` keyword.

By addressing the problem of state inconsistency in the defective code, this example demonstrates the importance of using the Singleton pattern in scenarios where application state must be maintained consistently across multiple requests.
