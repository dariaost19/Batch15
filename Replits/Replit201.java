package Replits;
//Create a Map in which you do not need to preserve the order of the entries
//Add below pair to it .
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//Find how many entries are inside the map
//Remove all entires from the Map
//Find the Map size again
//**Expected Output:**`
//5
//0

import java.util.LinkedHashMap;

public class Replit201 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> address = new LinkedHashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", "265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United States");
        System.out.println(address.size());
        address.clear();
        System.out.println(address.size());
    }
}
