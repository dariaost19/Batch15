package Homework22;
//Create the collection that will store single uniques Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.

import java.util.LinkedHashSet;
import java.util.Set;

public class ConcatAllString {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("pear");
        String concat=" ";

        for(String s:fruits){
            concat+=s+" ";

        }
        System.out.println(concat);
    }
}
