// public class BreakStnt {
//     public static void main(String[] args) {

//         // for loop
//         for(int i = 1; i <= 10; ++i) {
//             // if the value of i is 5 the loop terminates
//             if (i == 5) {
//                 break;
//         }
//         System.out.println(i);
//         }


//     }
// }
import java.util.Scanner;

public class BreakStnt {
    public static void main(String[] arg) {

        Double number, sum = 0.0;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");

            // takes double input from user
            number = input.nextDouble();

            // if number is negative the loop terminates
            if (number < 0.0) {
                break;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}