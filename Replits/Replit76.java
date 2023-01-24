package Replits;

import java.util.Scanner;

public class Replit76 {
    public static void main(String[] args) {
        //Write a program that creates a String array with size 7.
        //
        //Ask the user to input Days of a week beginning with Sunday using Scanner class.
        //
        //Add these inputs to your array and then print all values from that array
        //
        //Example:
        //
        //Please enter day 1 of the week
        //
        //Sunday
        //
        //Please enter day 2 of the week
        //
        //Monday
        String[] days = new String[7];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < days.length; i++) {
            System.out.println("Please enter day starting Sunday ");
            days[i] = scan.next();
        }
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
