package HomeWork4;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class HWTask4 {
    public static void main(String[] args) {
        /*
        4)Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”. (edited)
[2:59 PM]

         */
        Scanner my=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month= my.next();
        switch (month){
            case "December":
            case "January":
            case"February":
                System.out.println("You were born in Winter");
                break;
            case"March":
            case"April":
            case"May":
                System.out.println("You were born in Spring");
                break;
            case"June":
            case"July":
            case"August":
                System.out.println("You were born in Summer");
                break;
            case"September":
            case"October":
            case"November":
                System.out.println("You were born in Fall");
        }
    }
}
