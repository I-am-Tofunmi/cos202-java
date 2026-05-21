public class StudentReport {
    public static String getGrade (int score) {
        if (score >= 70) return "A";
        else if (score >= 60) return "B";
        else if (score >= 50) return "C";
        else if (score >= 45) return "D";
        else return "F";
    }

    public static boolean isPass(int score) {
        return score >= 50;
    }

    public static int highestScore (int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String[] args) {
        printReport("Panda", 73);
        System.out.println("Highest: " + highestScore(65, 89, 72));
    }
    
    public static void printReport(String name, int score) {
    System.out.println("--- Student Report ---");
    System.out.println("Name: " + name);
    System.out.println("Score: " + score);
    System.out.println("Grade: " + getGrade(score));
    System.out.println("Status: " + (isPass(score) ? "Pass" : "Fail"));
}
}