package Homework3;

import java.util.Scanner;

public class Class4Task7 {
    public static void main(String[] args) {
        /*
        Write a program to ask user to enter numbers of worked years and annual salary.
        If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
         Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your worked years ");
        int workedyears = input.nextInt();
        if(workedyears>=5){

            System.out.println("You are eligible for bonus!!");
            System.out.println("What is your salary");
        }else {
            System.out.println("You are not eligible for bonus");
        }
        int salary = input.nextInt();
        if(salary>50000){
            System.out.println("Your bonus is 5000");

        }else
            System.out.println("Your bonus is 3000");
        }

    }







