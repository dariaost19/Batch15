package Replits;

import java.util.LinkedList;

public class RemoveArraylistdivisibleby3 {
    public static void main(String[] args) {
            LinkedList<Integer> numbers=new LinkedList<>();

            for(int i=50;i<100;i++){

                if(i%3==0){
                    numbers.add(i);

                }

            }
            System.out.print(numbers);
        }
    }

