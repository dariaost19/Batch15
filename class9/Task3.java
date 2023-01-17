package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 2 numbers starting point and ending point");
        int start = scan.nextInt();
        int end= scan.nextInt();
        System.out.println("start number " +start+ " end number " +end );

        int evensum=0;
        int oddsum=0;
        for (int i =start; i <=end ; i++) {
          if(i%2==0){
             evensum+=i;
          }else{
             oddsum=oddsum+i; // adding formula
          }
            }
        System.out.println("Sum of all the even numbers" + evensum);
        System.out.println("Sum of all odd numbers" + oddsum);
            
        }
    }

