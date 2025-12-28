# Vehicle Management System
## Overview
A Java OOP project demonstrating inheritance, abstraction, composition, and aggregation through a vehicle management system.

## Class Hierarchy
### Vehicle (abstract) – Base class with brand, year, startEngine(), stopEngine()

### Car, Motorcycle, Truck – Subclasses with additional fields and overridden methods

### Driver – Associated with vehicles (composition/aggregation)

## How to Run
```bash
javac *.java
java Main
```

## Screenshots

![App Screenshot](lib/Снимок%20экрана%202025-12-29%20030801.png)

## Reflection
Inheritance allowed sharing common logic in Vehicle, reducing duplication. Method overriding enabled custom engine behaviors per vehicle type.

Using protected access simplified subclass field usage, while default access required careful package structuring to maintain encapsulation.