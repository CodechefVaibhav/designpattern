# Factory Pattern Problem

## Problem
In the initial design, the client code is directly dependent on the concrete classes, making it hard to modify or extend the application. Any addition of new transport types requires changes in the client code.

## Impact
This tight coupling leads to high maintenance costs and increased chances of introducing bugs when modifying or extending the application.

## Solution-Explanation
The Factory pattern abstracts the creation of objects, allowing the client code to be decoupled from the concrete classes. This makes the application easier to maintain and extend by simply modifying the factory without changing the client code.
