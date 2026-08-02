public class PrivateNoOrg {

    int i;

    // constructor with no parameter
    private Main() {
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {

        // calling the constructor without any parameter
        Main obj = new Main();
        System.out.println("Value of i: " + obj.i);
    }
}