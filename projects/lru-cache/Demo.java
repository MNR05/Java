public class Demo {
    public static void main(String[] args) {
        LruCache<String, Integer> cache = new LruCache<>(2);
        cache.put("A", 1);
        cache.put("B", 2);
        cache.get("A");
        cache.put("C", 3);
        System.out.println("B evicted: " + (cache.get("B") == null));
        System.out.println("A retained: " + cache.get("A"));
    }
}
