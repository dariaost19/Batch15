package class7;

import java.util.Scanner;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Please enter a number");
            number = scan.nextInt();

        } while (number != 5);
        int number2 = 0;
        while (number2 != 5) {
            System.out.println("Please enter a number :");
            number2 = scan.nextInt();
            // we will get the same output using DoWhile or While
        }
    }
}
