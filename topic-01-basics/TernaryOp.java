import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {

        // take input from users
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();

        // ternary operator checks if
        // mark is greater than 40
        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");
        input.close();
    }
}