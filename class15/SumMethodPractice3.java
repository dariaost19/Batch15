package class15;

public class SumMethodPractice3 {
    int arraysum(int[] arr) { // =name of the method
        //create a method that takes an array of int sum all the element from the array and return the sum.
        //return type is int
        //name of Method => could be any
        //parameters =int [] arr
        int sum = 0;
        for (int num : arr) {
            sum += num;

        }
        return sum;
    }
}