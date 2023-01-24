package Replits;

import java.util.Scanner;

public class Repli61 {
    public static void main(String[] args) {
        //Ask the user to enter any number from 1-7.
        //
        //Based on the number define the day of the week
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number from 1-7");
        int number=scan.nextInt();
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
