public class Statement {
    public static void main(String[] args) {

        // int number = 10;

        // checks if number is less than 0
        // if (number < 0) {
        //     System.out.println("The number is negative.");
        // }
        // System.out.println("Statement outside if block");

        // create a string variable
        // String language = "Java";

        // if Statement
        // if (language == "Java") {
        //     System.out.println("Best Programming Language");
        // }

        // if & else statement
        // int number = 10;
        // // checks if number is greater than 0
        // if (number > 0) {
        //     System.out.println("The number is positive.");
        // }

        // // execute the block
        // // if number is not greater than 0
        // else {
        //     System.out.println("The number is not positive.");
        // }

        // System.out.println("Statement outside if... else block");

        int number = 0;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }

        // if both condition is false
        else {
            System.out.println("The number is 0.");
        }
    }
}