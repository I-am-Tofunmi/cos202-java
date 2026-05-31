public class DataTypes {
    public static void main(String[] args) {

        // 1. Declare variable of each primitive type
        int age = 20;
        double gpa = 4.5;
        boolean isStudent = true;
        char grade = 'A';

        // 2. Print them all
        System.out.println("Age: " + age);
        System.out.println("Gpa: " + gpa);
        System.out.println("Is student: " + isStudent);
        System.out.println("Grade: " + grade);

        // 3. Integer division trap
        int x = 10, y = 3;
        System.out.println("Int division: " + x / y);
        System.out.println("Double division: " + (double) x / y);

        // 4. String (reference type)
        String name = "Panda";
        System.out.println("Name: " + name);
        System.out.println("Name length: " + name.length());
    }
}