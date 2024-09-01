# Builder Pattern Problem

## Problem
The initial design uses a constructor overloaded with multiple parameters, leading to complex and error-prone object creation. It becomes difficult to determine which parameters are being set, and it is easy to make mistakes in the order of arguments.

## Impact
This approach reduces code readability and increases the likelihood of bugs during object creation, especially as the number of parameters grows.

## Solution-Explanation
The Builder pattern provides a flexible solution by allowing the incremental construction of an object. It enhances code readability, makes the object creation process more intuitive, and reduces the chances of errors.
