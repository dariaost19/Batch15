package class15;

public class LargerNumMPractice4 {
    //create a method that takes 2 numbers as parameters and return the larger number
    int numbers(int num1, int num2) {
        int result = 0;
        if (num1 > num2) {
            result = num1;
        } else if (num2 > num1) {
            result = num2;

        }
        return result;
         //we can also do like this
        /*

        int numbers(int num1, int num2) {

        if (num1 > num2) {
            return = num1;
        } else if (num2 > num1) {
            return = num2;

        }

         */
    }
}
