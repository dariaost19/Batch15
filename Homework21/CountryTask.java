package Homework21;

import java.util.TreeSet;

public class CountryTask {
    public static void main(String[] args) {
        //Create a Set collection in which you need to add names of the countries.
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.
        TreeSet<String>countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Ukraine");
        countries.add("Germany");
        countries.add("France");
        countries.add("China");
        System.out.println(countries);
        for(String c:countries){
            System.out.print(c+" ");
        }

    }
}
