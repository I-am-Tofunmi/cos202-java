// class MultipleExceptions {
//     public static void main(String[] args) {
//         try {
//             int array[] = new int[10];
//             array[10] = 30 / 0;
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException => " + e.getMessage());
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException => " + e.getMessage());
//         }
//     }
// }

class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
          System.out.println("Exception => " + e.getMessage());
        }
    }
}