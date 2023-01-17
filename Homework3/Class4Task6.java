package Homework3;

import java.util.Scanner;

public class Class4Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
       String answer = input.nextLine();
        if (answer.equals("yes"))
        {
            System.out.println("What is your balance?");
        }else
        {
            System.out.println("We can offer you one!");
        }
        int balance= input.nextInt();
        if(balance>1000){
            System.out.println("Please pay it off immediately!!");
        }else {
            System.out.println("You can spend more!!");
        }
    }
}

