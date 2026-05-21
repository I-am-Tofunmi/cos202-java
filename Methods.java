public class Methods {

        public static int add (int a, int b) {
            return a + b;
        }

        public static double average (int x, int y, int z) {
            return (double) (x + y + z) / 3;
        }

        public static void printMessage(String name) {
            System.out.println("Hello, " + name + "! Welcome to Java.");
        }

        public static boolean isEven(int n) {
            return n % 2 == 0;
        }

        public static void main (String[] args) {
            System.out.println(add(10, 5));
            System.out.println(average(80, 90, 70));
            printMessage("Panda");
            System.out.println(isEven(42));
            System.out.println(isEven(7));
        }

    }
