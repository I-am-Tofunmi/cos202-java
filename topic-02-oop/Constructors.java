public class Constructors {
    private String name;

    // constructor
    Main() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main Class
        Main obj = new Main();
        System.out.println("The name is  + obj.name");
    }
}