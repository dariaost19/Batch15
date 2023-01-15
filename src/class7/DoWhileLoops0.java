package class7;

import java.util.Scanner;

public class DoWhileLoops0 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int number=0;
        do{
        System.out.println("Please enter a number");
        number= scan.nextInt();

        }while (number!=5);
    }
}
