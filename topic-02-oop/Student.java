public class Student {

    // private fields
    private String name;
    private String course;
    private int score;

    // constructor
    public Student(String name, String course, int score) {
        this.name = name;
        this.course = course;
        this.score = score;
    }

    // getters
    public String getName() { return name; }
    public String getCourse() { return course; }
    public int getScore() { return score; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("Invalid score!");
        }
    }

    // methods
    public String getGrade() {
        if (score >= 70) return "A";
        else if (score >= 60) return "B";
        else if (score >= 50) return "C";
        else if (score >= 45) return "D";
        else return "F";
    }

    public String getStatus() {
        return score >= 50 ? "Pass" : "Fail";
    }

    public void printReport() {
        System.out.println("=== Student Report ===");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + getGrade());
        System.out.println("Status: " + getStatus());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Mathematics", 85);
        student1.printReport();

        System.out.println("--- updating score ---");
        student1.setScore(150);  // Invalid score!
        student1.setScore(60);   // valid
        student1.printReport();  // score should now be 60
    }
}