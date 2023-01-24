package ProjectTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // )Using Scanner create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers =new int[5];
        int sum =0;

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]= scan.nextInt();
            sum+=numbers[i];
        }
        System.out.println("Sum of array is "  + sum);

    }
}
