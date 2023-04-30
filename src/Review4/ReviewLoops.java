package Review4;

import java.util.Scanner;
import java.util.SortedMap;

public class ReviewLoops {
    public static void main(String[] args) {
        //while loop ,We should use this type of code if we don't know how many times to repeat a block of code.
        int a=1;
        while (a<=3){
            System.out.println("I a while loop");
            a++;
        }
        // While Do Loop , first you want to print the block of code regardless of the condition
        int b=1;
        do{
            System.out.println("Do While");;
        }while (b>=3);

        //Ask students if they understand loop?
        // if they don't , tell them to practice more
        // if they do , they are good
        //Program will run until you say yes, otherwise it will keep asking

        Scanner scan=new Scanner(System.in);
    String answer;

       do {
         System.out.println("Do you understand loops in Java?");
           answer= scan.nextLine();
       }while (!answer.equalsIgnoreCase("yes"));

        }
    }

