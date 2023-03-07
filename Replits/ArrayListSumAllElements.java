package Replits;

import java.util.ArrayList;

public class ArrayListSumAllElements {
    public static void main(String[] args) {
        //Create Linked List that will store Integer Objects
        //Add the values below:
        //111
        //222
        //333
        //444
        //555
        //666
        //Create a logic to calculate sum of the all the values in list.
        //Print the result of sum.
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(444);
        arrayList.add(555);
        arrayList.add(666);
        int sum=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            sum+=arrayList.get(i);



        }
        System.out.println(sum);
    }
}
