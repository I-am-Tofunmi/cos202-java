public class MethodReturnType{
    
    // create a method
    public static int square(int num) {

        // return statement
        return num * num;
    }

    public static void main(String[] args) {
        int result;

        // call the method
        // store returned value to result
        result = square(10);

        System.out.println("Squared value of 10 is: " + result);
    }
}