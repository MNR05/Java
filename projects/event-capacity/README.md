# Event Capacity Manager

**Problem:** Concurrent event registrations must not exceed a defined capacity or allow duplicate attendees.

**Solution:** A synchronized in-memory `reserve` operation checks the existing set and capacity atomically.

**Complexity:** Expected O(1) per reservation.

```bash
javac -d out EventCapacity.java Demo.java
java -cp out Demo
```

**Scope:** Demonstration only; state disappears when the process exits. Distributed event registration requires a durable database with uniqueness and transaction handling.
