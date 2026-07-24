public class MethodOverloading {
    // private static void display(int a) {
    //     System.out.println("Arguments: " + a);
    // }

    // private static void display(int a, int b) {
    //     System.out.println("Arguments: " + a + " and " + b);
    // }

    // public static void main(String[] args) {
    //     display(1);
    //     display(1, 4);
    // }

    // this method accepts int
    private static void display(int a) {
        System.out.println("Got Integer data.");
    }

    // this method accepts String object
    private static void display(String a) {
        System.out.println("Got String object.")
    }

    public static void main(String[] args) {
        display(1);
        display("Hello");
    }
}