class Main {
    
    // non-static method
    int multiply(int a, int b) {
        return a * b;
    }

    // static method
    static int add(int a, int b) {
        return a + b;
    }
}
public class StaticTest {

    public static void main(String[] args) {

        // create an instance of the StaticTest class
        Main st = new Main();

        // call the nonstatic method
        System.out.println(" 2 * 2 = " + st.multiply(2, 2));

        // call the static method
        System.out.println(" 2 + 3 = " + Main.add(2, 3));
    }
}