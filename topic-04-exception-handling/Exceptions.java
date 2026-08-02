// // // Exceptions handling using try...catch
// // class Exceptions {
// //     public static void main(String[] args) {

// //         try {

// //             // code that generate exception
// //             int divideByZeo = 5 / 0;
// //             System.out.println("Rest of code in try block");
// //         }

// //         catch (ArithmeticException e) {
// //             System.out.println("ArithmeticException => " + e.getMessage());
// //         }
// //     }
// // }

// class Exceptions {
//     public static void main(String[] args) {
//         try {
//             // code that generates exception
//             int divideByZero = 5 / 0;
//         }

//         catch (ArithmeticException e) {
//             System.out.println("ArithmeticException => " + e.getMessage());
//         }

//         finally {
//             System.out.println("This is the finally block");
//         }
//      }
// }

import java.io.*;

class Exceptions {
  // declareing the type of exception
  public static void findFile() throws IOException {

    // code that may generate IOException
    File newFile = new File("test.txt");
    FileInputStream stream = new FileInputStream(newFile);
  }

  public static void main(String[] args) {
    try {
      findFile();
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}