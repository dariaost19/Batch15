package Replits;

import java.util.Scanner;

public class Replit95Printfirst3Letter {
    //Using Scanner class input string value.
    //
    //Print out the following: "The first 3 letters of \_\_\_ is ___"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String input = scan.next();

        System.out.println("The first 3 letter of " + input + "is " + input.substring(0, 3));
    }
}
