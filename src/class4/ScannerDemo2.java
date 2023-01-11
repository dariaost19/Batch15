package class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=input.nextInt(); // this line could change for different variables(boolean, float, etc)
        System.out.println("you are  " +age+ " years old");
        //This is how we take int datatype from keyboard.
    }
}
