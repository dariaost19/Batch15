package Replits;

public class Replit81 {
    public static void main(String[] args) {
        //Write a program that prints the highest value in the array.
        int [] numbers={5,4,8};
        int maxnumber=numbers[0];
        for (int i = 0; i <numbers.length; i++) {
            //Compare elements of array with max
            if(numbers[i] > maxnumber)
                maxnumber = numbers[i];

        }
        System.out.println(maxnumber);
    }
}
