package Replits;

import Homework13.Task3;

import java.util.Scanner;

public class Replit105vowels {
    public static void main(String[] args) {

    //There is a code that takes input as a String.
    //
    //Write a program that will print out only vowels of that string
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        System.out.println(word.replaceAll("[^a,o,e,u,i]",""));
    }
}
