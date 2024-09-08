# Adapter Design Pattern

## 1. Introduction
The **Adapter Design Pattern** allows two incompatible interfaces to work together. It acts as a bridge between different systems or components, making them compatible without modifying their code.

In this implementation, we use a `Map<String, Processor>` structure to handle different payment types and providers without modifying the service or controller layers when new providers are added.

## 2. Defective Implementation
In the defective version, the `PaymentService` is tightly coupled to specific payment processors (e.g., VISA for credit cards and Venmo for wallets). Adding or switching to new processors (e.g., MasterCard for credit cards or PayPal for wallets) would require modifying the service logic, making it rigid and difficult to scale.

### cURL Command for Defective Version:
```bash
curl "http://localhost:8080/pay?paymentType=CreditCard&amount=100"
curl "http://localhost:8080/pay?paymentType=Wallet&amount=50"
```

## Improved Implementation with Adapter Design Pattern and Map
In the improved implementation, the PaymentAdapter uses a map to store payment providers (e.g., Visa, MasterCard, Venmo, PayPal) and their corresponding processor implementations. Spring automatically injects these maps based on the registered beans, eliminating the need for manual map population.

### When to use Adapter Design Pattern?
- When you need to integrate multiple external services (e.g., different payment processors) and switch between them easily.
- When you want to decouple the service logic from third-party service implementations, making the system more maintainable.

### When not to use it?
- If your external services have similar interfaces, there may be no need for an adapter.
- Avoid using it in cases where the added complexity of the adapter and map introduces unnecessary overhead.

### How it impacts memory footprint?
Using the map-based approach may slightly increase memory usage due to the additional data structure, but the overall performance impact is negligible compared to the flexibility and maintainability benefits it provides.

## Real-world Example
In an e-commerce platform, a map-based adapter can be used to handle payments through various providers like VISA, MasterCard, Venmo, and PayPal. The platform can switch between these providers by simply updating the map, making the system more flexible and easier to maintain.

##Pros and Cons of Adapter Design Pattern
###Pros:
- Flexibility: Easily switch or add new payment processors without affecting the service or controller layers.
- Loose Coupling: The service logic is decoupled from specific payment processors, making the code more modular.
- Scalability: Easily scale the system by adding new payment types or providers.

### Cons:
- Increased Complexity: The adapter adds an extra layer of abstraction, which may increase complexity.
- Overhead: There may be slight performance overhead from map lookups.


## cURL Commands for Improved Version
```bash
# To process payment via VISA Credit Card
curl "http://localhost:8080/pay?paymentType=CreditCard&paymentProvider=visaProcessor&amount=100"

# To process payment via Venmo Wallet
curl "http://localhost:8080/pay?paymentType=Wallet&paymentProvider=venmoProcessor&amount=50"

# Switching to MasterCard (just change the provider name in the request)
curl "http://localhost:8080/pay?paymentType=CreditCard&paymentProvider=masterCardProcessor&amount=100"

# Switching to PayPal (just change the provider name in the request)
curl "http://localhost:8080/pay?paymentType=Wallet&paymentProvider=payPalProcessor&amount=50"
```