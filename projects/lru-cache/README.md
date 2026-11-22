# LRU Cache

**Problem:** A fixed-size cache needs to discard old data predictably.

**Solution:** A `LinkedHashMap` using access-order mode and `removeEldestEntry` removes the least-recently-used entry on insertion.

**Complexity:** Expected O(1) lookup/update and O(capacity) memory.

```bash
javac -d out LruCache.java Demo.java
java -cp out Demo
```

Not synchronized. Add concurrency controls for shared access.
