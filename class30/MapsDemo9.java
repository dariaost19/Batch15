package class30;

import java.util.Map;
import java.util.TreeMap;
//get only values with the help of for loop and Iterator
public class MapsDemo9 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Italy", "Rome");
        countries.put("France", "Paris");
        countries.put("Ukraine", "Kyiv");
        var values = countries.values();
        for (var value : values) {
            System.out.println(value);
        }
        System.out.println();
        var iterator = countries.values().iterator();
        while (iterator.hasNext()) {
            var value = iterator.next();
            System.out.println(value);

        }
    }
}


