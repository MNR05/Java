public class Demo {
    public static void main(String[] args) {
        EventCapacity event = new EventCapacity(2);
        System.out.println("Alex: " + event.reserve("demo-alex"));
        System.out.println("Sam: " + event.reserve("demo-sam"));
        System.out.println("Duplicate: " + event.reserve("demo-alex"));
        System.out.println("Extra: " + event.reserve("demo-third"));
        System.out.println("Available seats: " + event.available());
    }
}
