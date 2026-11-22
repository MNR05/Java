# Java Engineering Labs

Focused Java mini-projects using the **Java 21 standard library**: practical data structures and business rules rather than isolated snippets.

> **Dates:** This collection is being implemented in 2026. It does not claim that new code was written in 2018.

## Projects

| Project | Purpose | Concepts |
| --- | --- | --- |
| [LRU Cache](./projects/lru-cache/) | Bound memory use by evicting least recently used entries | LinkedHashMap, O(1) lookups, state |
| [Event Capacity Manager](./projects/event-capacity/) | Safely reserve limited event seats | Synchronization, immutable IDs, validation |

## Quick start

Install **JDK 21+** and run:

```bash
javac -d out projects/lru-cache/LruCache.java projects/lru-cache/Demo.java
java -cp out Demo

javac -d out projects/event-capacity/EventCapacity.java projects/event-capacity/Demo.java
java -cp out Demo

javac -d out projects/lru-cache/LruCache.java projects/event-capacity/EventCapacity.java tests/SmokeTests.java
java -cp out SmokeTests
```

No external dependencies. All names and examples are fictional.
