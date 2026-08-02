import java.util.concurrent.LinkedBlockingQueue;

class LinkedBlockingQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>();

        // Using add()
        animals.add("Dog");
        animals.add("Horse");

        // Using offer()
        animals.offer("Cat");
        System.out.println("LinkedBlockingQueue: " + animals);
    }
}