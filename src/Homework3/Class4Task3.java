package Homework3;

import java.util.Scanner;

public class Class4Task3 {
    public static void main(String[] args) {
        /*
        You are a loan specialist and you need to ask user what is the amount of loan is needed.
        If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("What loan amount is needed?");
        int loanamount=input.nextInt();
        if ((loanamount<=200000)){
            System.out.println("You are approved");
        }else {
            System.out.println("You are rejected");
        }
    }
}
