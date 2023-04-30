package Homework23;
//) How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        try {
            System.out.println("Please enter a number from 1-10");
            number = scan.nextInt();

        } catch (InputMismatchException e) {


            System.out.println("Your entry does not match. Please try again");
            scan.next();
        }

    }
}





