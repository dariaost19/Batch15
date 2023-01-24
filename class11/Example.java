package class11;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        // print all 3 arrays

        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}

        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // will give us the size of each 1D array
                System.out.println(matrix[i][j] +" ");

            }
            System.out.println();
        }
    }
}
