package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers =new int[5];
// Below code take the numbers from user and store it in the array.
       /* numbers[0]= scan.nextInt();
        numbers[1]= scan.nextInt();
        numbers[3]= scan.nextInt();
        numbers[2]= scan.nextInt();
        numbers[4]= scan.nextInt();
        System.out.println(Arrays.toString(numbers));

        */
        // Below is the code to use a for loop to ask user for numbers and store it in the array.
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]= scan.nextInt();


        }
        System.out.println(Arrays.toString(numbers));




    }
}
