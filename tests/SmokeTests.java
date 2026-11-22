public class SmokeTests {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        LruCache<String, Integer> cache = new LruCache<>(2);
        cache.put("a", 1); cache.put("b", 2);
        check(cache.get("a") == 1, "cache get");
        cache.put("c", 3);
        check(cache.get("b") == null, "LRU eviction");
        check(cache.size() == 2, "cache capacity");

        EventCapacity event = new EventCapacity(2);
        check(event.reserve("p1"), "first registration");
        check(!event.reserve("p1"), "no duplicates");
        check(event.reserve("p2"), "second registration");
        check(!event.reserve("p3"), "capacity enforced");
        check(event.available() == 0, "no seats available");
        System.out.println("All Java smoke tests passed.");
    }
}
