public class Methods {
    // create a method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
        }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        // create an object of Main
        Main obj = new Main();
        // calling method
        int result = obj.addNumbers(nuum1, num2);
        System.out.println("Sum is: " + result);
    }
}