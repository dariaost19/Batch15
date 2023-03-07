package Replits;

import java.util.LinkedList;

public class FibonachiLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();

        // Create the first two nodes of the linked list with the first two numbers of the Fibonacci series
        int x = 0, y = 1;
        System.out.print(x + " " + y + " ");

        // Add the next 8 numbers of the Fibonacci series to the linked list
        for (int i = 2; i < 10; i++) {
            int sum = x + y;
            System.out.print(sum + " ");
            x= y;
            y = sum;
        }
    }




        }




