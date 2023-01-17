package PracticeJava;

import java.util.Scanner;

public class Replit77 {
    public static void main(String[] args) {


        String[] days = new String[7];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < days.length; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week ");
            days[i] = scan.next();
        }
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}

