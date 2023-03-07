package class28;

import java.util.ArrayList;

public class LinkedListVsArrayListDemo3 {
    public static void main(String[] args) {
        //linkedList takes 151 ms
        //arraylist takes 206068 ms to run the code
        long startTime=System.currentTimeMillis(); //timer
       ArrayList<String> numbers=new ArrayList<>();
        for (int i=0;i<1000000;i++){
            numbers.add(0,"Test Data"); // we are going to add test data on location 0(every time I insert new data, I want to shift elements in between)
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
