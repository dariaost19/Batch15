package review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        //how to find size of my arraylist
        arrayList.size();
        arrayList.get(0);
        int firstElement=arrayList.get(0);
        arrayList.set(0,120);// replacing value of the first element
        firstElement=arrayList.get(0);
        System.out.println(firstElement);
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
