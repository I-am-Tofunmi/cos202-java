public class PublicNoOrg {
    String name;

    // public constructor
    public Company() {
        name = "Programiz";
    }
}

class Main {
    public static void main(String[] args) {

        // object is created in another class
        Company obj = new Company();
        System.out.println("Company name = " + obj.name);
    }
}