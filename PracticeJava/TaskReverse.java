package PracticeJava;

import java.util.Scanner;

public class TaskReverse {
    public static void main(String[] args) {
        //2) Create a String and print it in reverse order (Sunday → yadnuS).
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word");
        String word = scan.next();
        StringBuilder reverseString = new StringBuilder(word);
        reverseString.reverse();
        String reverse = reverseString.toString();

        System.out.print(reverse + " ");


    }
}


