package class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // step 1 : ask user for item price and item name
        //step 2: accumulate the price
        // step 3: how much total user should pay
        // step 4: if user gives more money we should give a change
        // step 5 : when user done should say Thank you!
        Scanner scan = new Scanner(System.in);
        double total=0;
        for (int i = 0; i <5 ; i++) {

            System.out.println("Please enter the item and its price");
            String item = scan.nextLine();
            double itemPrice = scan.nextDouble();
            total=total+itemPrice;
                 System.out.println(" Your total is " +total);
        }
        System.out.println("Please pay for your items");
             double amountPaid= scan.nextDouble();
             if(amountPaid>total){
                 double change=amountPaid-total;
                 System.out.println("Here is your change"  +change);
             }else if(amountPaid<total){
                 System.out.println(" You cant buy all the items");

             }else{
                 System.out.println("you paid in full");
             }
        System.out.println("Thank you for shopping with us!!!");



    }
}

