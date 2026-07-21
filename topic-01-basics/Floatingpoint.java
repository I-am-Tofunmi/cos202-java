public class Floatingpoint {
    public static void main(String[] args) {
        double myDouble = 3.4;
        float myFloat = 3.4F;

        // 3.445 * 10^2
        double myDoubleScientific = 3.445e2;

        System.out.println(myDouble); // prints 3.4
        System.out.println(myFloat); // prints 3.4
        System.out.println(myDoubleScientific); // prints 344.5
    }
}