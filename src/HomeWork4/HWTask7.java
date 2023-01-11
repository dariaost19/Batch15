package HomeWork4;

import java.util.Scanner;

public class HWTask7 {
    public static void main(String[] args) {
        // Ask user to enter their country and capture it.
        // Once values are captured print which language user speaks.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter county name");
        String country= scan.next();
        switch (country) {
        case"USA":
            System.out.println("English");
            break;

            case "Ukraine":
                System.out.println("Ukrainian");
                break;
            case"China":
                System.out.println("Chinese");
                break;
            case"Italy":
                System.out.println("Italian");
                break;
            case"France":
                System.out.println("French");
                break;
            default:
                System.out.println("Not Specified");


        }

    }
}
