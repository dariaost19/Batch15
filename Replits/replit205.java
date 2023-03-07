package Replits;

import java.util.HashMap;
import java.util.LinkedHashMap;

//Print all the values in upper case using entrySet
public class replit205 {
    public static void main(String[] args) {
        HashMap<String, String> address = new HashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", "265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United States");
        var values = address.values();
        for (var value : values) {
            System.out.println(value.toUpperCase());
        }
    }
}

