import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class BlockingQueue {

    public static void main(String[] args) {
        // Create a blocking queue using the ArrayBlockingQueue
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

        try {
            // Insert elements into the blocking queue
            numbers.put(2);
            numbers.put(1);
            numbers.put(3);
            System.out.println("BlockingQueue: " + numbers);

            // Remove Elements from blocking queue
            int removedNumber = numbers.take();
            System.out.println("Removed Number: " + removedNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}