// public class MultiDimensionalArray {
//     public static void main(String[] args) {

//         // double[][] matrix = {{1.2, 4.3, 4.0}, {4.1, -1.1}
//         // int[][] a = new int[3][4];
//         // int[][] b = {
//         //     {1, 2, 3},
//         //     {4, 5, 6, 9},
//         //     {7},
//         // }

//         // create a 2d array
//         int[][] a = {
//             {1, 2, 3},
//             {4, 5, 6, 9},
//             {7},
//         };

//         // calculate the length of each row
//         System.out.println("Length of row 1: " + a[0].length);
//         System.out.println("Length of row 2: " + a[1].length);
//         System.out.println("Length of row 3: " + a[2].length);
//     };
// }

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // create a 3d array
        int[][][] test = {
            {
              {1, -2, 3}, 
              {2, 3, 4}
            }, 
            { 
              {-4, -5, 6, 9}, 
              {1}, 
              {2, 3}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}