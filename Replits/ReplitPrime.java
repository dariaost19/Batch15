package Replits;

import java.util.LinkedList;

public class ReplitPrime {
    public static void main(String[] args) {
        //Create an Linked List that will store all prime numbers from 1 to 100
        //Step 1. Create a method that will identify wether number is prime or not
        //Step 2. Add all prime numbers into Linked List
        //Print Linked List:
        //
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=1; i<=100; i++){
            int count = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    count++;
            if (count == 2)
                linkedList.add(i);
            else
                continue;
        }
        System.out.println(linkedList);

    }
}




