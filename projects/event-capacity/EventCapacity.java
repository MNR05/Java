import java.util.HashSet;
import java.util.Set;

/** Atomic in-memory reservation of unique visitor IDs for a single event. */
public final class EventCapacity {
    private final int capacity;
    private final Set<String> attendees = new HashSet<>();

    public EventCapacity(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("Capacity must be positive");
        this.capacity = capacity;
    }

    public synchronized boolean reserve(String personId) {
        if (personId == null || personId.isBlank()) throw new IllegalArgumentException("Person ID required");
        String normalized = personId.trim();
        if (attendees.contains(normalized) || attendees.size() >= capacity) return false;
        return attendees.add(normalized);
    }

    public synchronized int occupied() { return attendees.size(); }
    public synchronized int available() { return capacity - attendees.size(); }
}
