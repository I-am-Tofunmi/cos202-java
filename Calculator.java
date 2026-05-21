public class Calculator {
        public static void main(String[] args) {

            int num1 = 20;
            int num2 = 6;
            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Product: " + (num1 * num2));
            System.out.println("Quotient: " + (num1 / num2));
            System.out.println("Remainder: " + (num1 % num2));
            System.out.println("Actual division: " + (double) num1 / num2);

            String operation = "division";
            System.out.println("The trickiest operation is: " + operation);

        }
}