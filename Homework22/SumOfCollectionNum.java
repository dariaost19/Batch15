package Homework22;
//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers (edited)


import java.util.ArrayList;
import java.util.List;

public class SumOfCollectionNum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
