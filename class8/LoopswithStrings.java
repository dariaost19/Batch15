package class8;

import java.util.Scanner;

public class LoopswithStrings {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your name");
        while (scan.next().equalsIgnoreCase("Sha")){
            System.out.println("Great student who always want an example with String in Loop");
        }

    }
}
