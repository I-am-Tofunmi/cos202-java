// import java.util.Scanner;
// public class InputOutput {
//     public static void main(String[] args) {
//         //  Java Input
//         System.out.println("Enter your name: ");
//         // create an object of Scanner
//         Scanner input = new Scanner(System.in);

//         // take input from the user
//         int number = input.nextInt();
//     }

// }
import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
    }
}