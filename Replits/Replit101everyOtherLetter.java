package Replits;

import java.util.Scanner;

public class Replit101everyOtherLetter {
    //Write a for loop that will print out every other letter in a String, starting with the first letter.
    // These letters should be printed all on one line with no space in between.
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i < word.length(); i+=2)
        {

            System.out.print(word.charAt(i));
        }
    }
}
