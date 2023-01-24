package ProjectTask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2)Using Scanner create an array of countries. When an array is created,
        // retrieve all values from it and while retrieving those values print capital for each country.
        // (use 2 different loops).
        Scanner scan = new Scanner(System.in);
        String [] country=new String[3];
        String [] capitals=new String[3];
        for (int i = 0; i <3; i++) {
            System.out.println("Please enter country ");
            country[i]= scan.next();


                System.out.println("Please enter capital ");
                capitals[i]= scan.next();
                System.out.println("\nThe capital of the  " + country[i] + " is " + capitals[i]+"\n");

            }

        }


    }


