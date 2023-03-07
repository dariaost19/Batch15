package class30;
//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.

import java.util.*;

public class MapsDemo8 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Italy", "Rome");
        countries.put("France", "Paris");
        countries.put("Ukraine", "Kyiv");
        System.out.println(countries);
        //get all Entries from the Set

      //  Set<Map.Entry<String, String>> entrySet = countries.entrySet();
        var entrySet=countries.entrySet(); //shorter way for line 18
      //  for (Map.Entry<String, String> entry : entrySet) {
        for(var entry:entrySet){ //replacing line 20
            System.out.println(entry.getKey()+"="+ entry.getValue());
        }
        System.out.println();

     //   Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        var iterator=countries.entrySet().iterator(); //replacing line 26
        while (iterator.hasNext()) {
          //  Map.Entry<String, String> country = iterator.next();
            var entry=iterator.next(); //replacing line 29 with var keyword
            System.out.println(entry.getKey() + "=" + entry.getValue());


        }
    }
}



