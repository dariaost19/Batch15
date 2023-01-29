package ProjectTask;

public class Task8 {
    public static void main(String[] args) {
      //  8)Write a Java Program to print the first 10 numbers of Fibonacci series.
        int number=10, number1=0,number2=1;


        for (int i = 1; i <=number ; i++) {
            System.out.print(number1+ " ");
            int nextnumber = number1 + number2;
            number1 = number2;
            number2 = nextnumber;


        }

        System.out.println("First 10 Fibonacci numbers");


    }
}
