package HomeWork4;

import java.util.Scanner;

public class HwTask06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Please enter 3 numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        if (num1 > num2 && num1 >num3) {
            System.out.println(num1 + " is the largest");
        } else if (num1 < num2 && num2 > num3) {
            System.out.println(num2 + " is the largest");


        } else if (num1 < num2 && num2 < num3) {
            System.out.println(num3 + " is the largest");

        }
    }
}

