package ProjectTask;

public class Task6 {
    public static void main(String[] args) {
        //6)Write a program to swap 2 numbers without a temporary variable?
        int num1=10;
        int num2=20;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(" After swapping the new value of num1 is " + num1+ "  and num2 is  "+ num2 );

    }
}
