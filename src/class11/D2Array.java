package class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {


        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        // How to print only one complete row
        System.out.println(matrix[2][4]); // first way
        System.out.println(Arrays.toString(matrix[0]));
        for (int i = 0; i < matrix.length ; i++) { // second way
            System.out.print(matrix[0][i]+" ");

        }
        System.out.println();
        int []arr=matrix[0];// means we interested only in 1st array
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
        System.out.println();

        for (int i = 0; i < matrix[2].length ; i++) { // to print 3rd array
            System.out.println(matrix[2][i]);

        }


    }
}
