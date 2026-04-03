# Order Pricing Kata

A kata for practicing yak shaving.

## Rules

- Use TDD.
- Never mix concerns in the same commit. Each commit should be about one thing.
- When you discover a problem, stop. Branch off, fix it separately, then rebase your work on top.
- Never reuse the same context (branch, commit) for unrelated changes.
- Shave the yaks in the right order.

## Your task

Add support for a new order type: `subscription`.

A subscription order applies a 15% discount to the base price (e.g. a base price of 33 results in a price of 28.05) and has a priority of 4.

## Getting started

```
npm install
npm run build
npm test
```
