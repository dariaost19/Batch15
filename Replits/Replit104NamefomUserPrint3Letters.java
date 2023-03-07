package Replits;

import java.util.Scanner;

public class Replit104NamefomUserPrint3Letters {
    public static void main(String[] args) {
        //Create an array of names that will hold 5 String elements.
        //
        //Names must be taking from a user.
        //
        //Print out the first three characters of each element of the array, one per line.
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name");
        String[] names = new String[5];
        for (int i = 0; i <names.length;i++ ) {

            names[i] = scan.nextLine();
            System.out.println(names[i].substring(0,3));
        }

    }
}

