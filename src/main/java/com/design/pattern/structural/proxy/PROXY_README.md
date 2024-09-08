# Proxy Design Pattern

## Overview

This repository demonstrates the **Proxy Design Pattern** in a Spring Boot application where multiple implementations of the `ExchangeRateService` exist (general exchange rates and cryptocurrency exchange rates). The proxy controls access to these services, applying logic like caching and delegation to the appropriate service. The controller only interacts with the proxy, simplifying its design.

### What is the Proxy Design Pattern?

The **Proxy Design Pattern** is a structural design pattern that provides a surrogate or placeholder for another object. A proxy controls access to the original object, allowing additional behavior such as caching, logging, or access control without modifying the underlying object.

In this example:
- **Proxy**: The `ExchangeRateProxy` acts as a surrogate for `ExchangeRateService` implementations.
- **Real Services**: The real services (`ExchangeRateServiceImpl` and `CryptoExchangeRateServiceImpl`) handle specific tasks like fetching general and cryptocurrency exchange rates.

### When to Use the Proxy Design Pattern

- **When direct access to a service is expensive or undesirable** (e.g., external API calls that need caching).
- **When you want to add additional functionality** such as caching, logging, security checks, or lazy loading, without modifying the actual service.
- **When you have multiple service implementations** that need to be managed centrally (as in this case, where we have both general and cryptocurrency exchange rates).

#### Memory Footprint and Performance

The **Proxy Design Pattern** can help improve performance by reducing redundant calls to expensive services. In this example, the proxy caches responses, reducing repeated API calls within a specific time interval. This reduces network usage and optimizes memory consumption.

### Real-World Use Cases
- **API Gateways**: API gateways often use proxies to cache responses from downstream services to avoid repeated expensive calls.
- **Database Connection Pooling**: Proxies manage database connections in connection pooling, controlling and optimizing access.
- **Security Proxies**: Proxies filter and control access to sensitive services, adding authentication and authorization checks.

### Pros of the Proxy Design Pattern
- **Improved Performance**: By adding caching, you avoid unnecessary repeated service calls.
- **Centralized Control**: The proxy can centralize access control, logging, and other functionalities across multiple services.
- **Extensibility**: New services can be added or replaced easily without changing the core logic in the controller or client.
- **Separation of Concerns**: Caching or logging logic is handled by the proxy, keeping the real services clean and focused on their primary responsibilities.

### Cons of the Proxy Design Pattern
- **Increased Complexity**: Introducing a proxy adds another layer of abstraction, making the code harder to follow.
- **Memory Usage**: Caching may consume additional memory, particularly if large datasets are involved.

### Implementation Details

This implementation includes:
1. **ExchangeRateImprovedService**: The common interface for both general and cryptocurrency exchange rate services.
2. **ExchangeRateImprovedServiceImpl**: Fetches general exchange rates (e.g., USD, EUR).
3. **CryptoExchangeRateImprovedServiceImpl**: Fetches cryptocurrency exchange rates (e.g., BTC, ETH).
4. **ExchangeRateProxy**: The proxy that delegates calls to the real services, applying caching logic to avoid frequent external calls.
5. **ExchangeRateImprovedController**: The REST controller that interacts with the proxy to serve requests.

## cURL Commands

### To fetch general exchange rates:
```bash
curl -X GET http://localhost:8080/rates/general
```
#### Example response:
```json
{
  "USD": 1.0,
  "EUR": 0.85
}
```
### To fetch cryptocurrency exchange rates:
```bash
curl -X GET http://localhost:8080/rates/crypto
```
#### Example response:
```json
{
  "BTC": 45000.0,
  "ETH": 3000.0
}
```