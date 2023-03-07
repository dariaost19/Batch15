package Replits;

import java.util.LinkedList;

public class Replit189RemoveElementsFromLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();


        for (int i = 50; i < 100; i++) {

            if (i % 3 != 0) {

               numbers.remove(i);
            }
            System.out.println(numbers);
        }
    }
}

