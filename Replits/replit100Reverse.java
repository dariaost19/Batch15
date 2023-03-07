package Replits;

import java.util.Scanner;

public class replit100Reverse {
    //Write a for loop that will print out the reverse of the string.
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String newStr = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            newStr += s.charAt(i);

        }
        System.out.println(newStr);
    }
}
