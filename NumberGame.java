public class NumberGame {
    public static void main(String[] args) {
        int number = 42;
        if ( number > 0) {
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        int n = 42;
        int steps = 0;
        while (n > 0) {
            System.out.println(n);
            n /= 2;
            steps++;
        }
        System.out.println("Steps: " + steps);

    }
}