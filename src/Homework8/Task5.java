package Homework8;

public class Task5 {
    public static void main(String[] args) {
        //Create an array of size 5 on integers and calculate the sum of all elements in an array.
        int[]number={2,8, 4,1,6};
        int sum=0;
        for (int i = 0; i < number.length ; i++) {
            sum=sum+number[i];

        }
        System.out.println(sum);

    }
}
