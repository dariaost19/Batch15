package Homework21;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CityTask1 {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Miami");
        cities.add("Los Angeles");
        cities.add("Dallas");
        cities.add("Atlanta");
        System.out.println(cities);
      cities.removeIf(c->c.startsWith("A"));
            System.out.println(cities);
        }

    }

