package Homework12;

public class Task5 {
    //5) Write a method to return whether given number is prime or not?
//What is a prime number in math?
// Prime number is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1
    Boolean number(int num) {
        boolean prime = true;
        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

        }
        return prime;
    }
}







































