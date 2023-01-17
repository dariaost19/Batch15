package Homework3;

import java.util.Scanner;

public class Class4Task1 {
    public static void main(String[] args) {
        /*
        Write a program to store a boolean value of whether user has diploma or not.
        If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree.
        Then if user has a degree program should check a gpa score.
        If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder”
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a diploma?");
        String answer = input.nextLine();
        if (answer.equals("yes")) {
            System.out.println("Congratulation!!");
        } if (answer.equals("yes")) {
            System.out.println("What is your GPA?");
            double gpa = input.nextDouble();
            if(gpa>=3.5){
                System.out.println("You are eligible for scholarship!!!");
            }else {
                System.out.println("You should study harder!!");
            }

        } else {
            System.out.println("You should get a degree!");
        }

        }
    }





