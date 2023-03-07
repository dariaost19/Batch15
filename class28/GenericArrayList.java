package class28;

import class15.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);
        ArrayList<String>name=new ArrayList<>(); //generic ArrayList
        ArrayList name1=new ArrayList();
        name1.add("Ehsan");
        name1.add(10);
        name1.add('a');
       for (Object j:name1){
           ((String)j).trim();
           System.out.println(j);
       }
    }
}
