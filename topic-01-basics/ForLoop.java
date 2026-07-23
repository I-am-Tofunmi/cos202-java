// Program to print a text 5 times

public class ForLoop {
    public static void main(String[] args) {

        // int n = 5;
        // for loop
        // for (int i = 1; i <= n; ++i) {
        //     System.out.println("Java is fun!");
        // }

        int sum = 0;
        int n = 1000;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += 1;
        }

        System.out.println("Sum = " + sum);
    }
}