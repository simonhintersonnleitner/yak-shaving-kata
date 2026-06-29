# Yak Shaving Kata — Java

This is the Java implementation of the yak-shaving kata.

## Getting Started

### Requirements
- Java 21 or later

### Run Tests

```bash
./mvnw test
```

The first run downloads Maven (~90 MB) and dependencies automatically. Subsequent runs use cached downloads.

## The Kata

The goal is to add support for a new `subscription` order type that:
- Applies a 15% discount to the base price (e.g. base price 33 → price 28.05)
- Has a priority of 4

Follow the constraints from the main README:
- The Agent does everything.
- Use TDD.
- Tidy First.
- Never mix concerns in the same commit.
- Never reuse the same context for unrelated changes.
- Shave the yaks in the right order.

Start with `OrderType.java` and the test file `OrderPricingTest.java` to understand the existing structure.
