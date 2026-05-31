public class OOPIntro {

    // Properties (fields)
    String name;
    int age;
    double gpa;

    // Constructor - called when you create an object
    public OOPIntro(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("---");
    }

    public static void main (String[] args) {
        // Creating objects from the class
        OOPIntro student1 = new OOPIntro("Panda", 20, 4.5);
        OOPIntro student2 = new OOPIntro("Tolu", 21, 4.0);

        student1.printInfo();
        student2.printInfo();
    }
}