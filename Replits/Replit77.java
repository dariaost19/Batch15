package Replits;

import java.util.Scanner;

public class Replit77 {
    public static void main(String[] args) {
        //Create an array of integers that will store 5 elements taken from a user
        //Don't print any prompt message for the user
        //Then print out all the elements you have created in the first loop in reverse order.
        Scanner scan=new Scanner(System.in);
        int[] element=new int[5];
        int input=scan.nextInt();
        int input1=scan.nextInt();
        int input2=scan.nextInt();
        int input3=scan.nextInt();
        int input4=scan.nextInt();

        element[0]=input;
        element[1]=input1;
        element[2]=input2;
        element[3]=input3;
        element[4]=input4;


        for(int i=element.length-1;i>=0;i--){
            System.out.println(element[i]);
        }


    }
}
