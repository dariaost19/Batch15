package Homework3;

import java.util.Scanner;

public class Class4Task5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter your city");
        String city= input.nextLine();
        System.out.println("please enter your temperature");
        double Temperature = input.nextDouble();
        System.out.println("The temperature in " +city+ " is" + " " +(Temperature+ -32) *5/9);

        }
    }

