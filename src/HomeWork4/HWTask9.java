package HomeWork4;

import java.util.Scanner;

public class HWTask9 {
    public static void main(String[] args) {
        //8)HomeWork: Using scanner class create calculator.
        // Allow user to enter 2 numbers and operator(+,-,*,/).
        // Based on operator provide the result to user. (edited)
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int number1= scan.nextInt();
        int number2= scan.nextInt();
        System.out.println("Please enter operator + , - , * , /");
        char operator=scan.next().charAt(0);
        switch (operator){
            case'+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                System.out.println(number1/number2);
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
