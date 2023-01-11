package HomeWork4;

import java.util.Scanner;

public class HWTask5 {
    public static void main(String[] args) {
        /*
        5) Write a program to find largest of three double values using if-else..if and
        logical operators provided by a user (numbers must be distinct)
         */
        Scanner my=new Scanner(System.in);
        System.out.println("Please enter  3 distinct numbers");
        double number1= my.nextDouble();
        double number2= my.nextDouble();
        double number3= my.nextDouble();
        if(number1<number2 &&number2<number3){
            System.out.println("The largest number is " +number3);
        }else if(number1>number2&&number1>number3){
            System.out.println("The largest number is " +number1);
        }
        if(number1<number2&&number3<number2){
            System.out.println("The largest number is"  +number2);
        }

    }
}
