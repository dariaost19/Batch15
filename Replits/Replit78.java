package Replits;

import java.util.Scanner;

public class Replit78 {
    public static void main(String[] args) {
        //Create an int array of integers with a size of 5 and input values with Scanner.
        //
        //Don't print prompt questions for a user.
        //
        //Using loop print out each element of the array that should look like the output below
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        int input1=scan.nextInt();
        int input2=scan.nextInt();
        int input3=scan.nextInt();
        int input4=scan.nextInt();

        int[] size =new int[5];
        size[0]=input;
        size[1]=input1;
        size[2]=input2;
        size[3]=input3;
        size[4]=input4;
        for (int i=0;i<size.length;i++) {
            System.out.println(size[i]*10);
        }
    }
}
