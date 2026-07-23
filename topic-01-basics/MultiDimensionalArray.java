public class MultiDimensionalArray {
    public static void main(String[] args) {

        // double[][] matrix = {{1.2, 4.3, 4.0}, {4.1, -1.1}
        // int[][] a = new int[3][4];
        // int[][] b = {
        //     {1, 2, 3},
        //     {4, 5, 6, 9},
        //     {7},
        // }

        // create a 2d array
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6, 9},
            {7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    };
}