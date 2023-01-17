package PracticeJava;
import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {



                Scanner input = new Scanner(System.in);

                System.out.println("Enter the length of the array:");
                int length1 = input.nextInt();
                int[] myArray = new int[length1];
                System.out.println("Enter the elements of the array:");

                for (int i = 0; i < length1; i++) {
                    myArray[i] = input.nextInt();
                }

                System.out.println(Arrays.toString(myArray));
            }
        }




