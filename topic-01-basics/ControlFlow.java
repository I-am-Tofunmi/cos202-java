public class ControlFlow {
    public static void main(String[] args) {

        // if / else if / else
        int score = 75;
        if (score >= 70) {
            System.out.println("Grade: A");
        } else if( score >= 60) {
            System.out.println("Grade: B");
        } else if( score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // for loop
        System.out.println("--- counting ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // while loop
        System.out.println("--- while ---");
        int n = 10;
        while (n > 0) {
            System.out.println(n);
            n -= 3;
        }
    }
}