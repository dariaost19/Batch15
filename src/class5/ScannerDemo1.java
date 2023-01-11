package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       // ctrl + tab go back and force
        /*
        Scanner => name of the class , name of command
        scan => just a variable like we create primitive (int, char , string)
        = => its assignment operator
        (System.in) = > tell the computer we want to read the data from keyboard.

         */
        System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are " +age+ " years old");
        System.out.println("Please enter your weight");
        double weight = scan.nextDouble();
        System.out.println(" You are "+weight+ " kg");
        System.out.println("Are you hungry?");
        boolean hungry = scan.nextBoolean();
        System.out.println("Hungry"+hungry);





        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is" +gender);
        System.out.println("Please enter your name");
        String name = scan.next(); //only when we have to put one word
        System.out.println("Your name is "+name);

        scan.nextLine(); //trick to make scan.next work
        System.out.println("Please enter your full name");
        String fullName= scan.nextLine();
        System.out.println("Your full name is " +fullName);

        scan.close();


    }
}
