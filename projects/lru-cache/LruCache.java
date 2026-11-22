import java.util.LinkedHashMap;
import java.util.Map;

/** O(1) expected get/put LRU cache, not thread-safe. */
public final class LruCache<K, V> {
    private final Map<K, V> entries;
    private final int capacity;

    public LruCache(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("Capacity must be positive");
        this.capacity = capacity;
        this.entries = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LruCache.this.capacity;
            }
        };
    }

    public V get(K key) { return entries.get(key); }
    public void put(K key, V value) { entries.put(key, value); }
    public int size() { return entries.size(); }
}
