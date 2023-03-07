package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
       // HashMap<String,Integer>groceries=new HashMap<>();  no order
     //   LinkedHashMap<String,Integer>groceries=new LinkedHashMap<>(); // will maintain the same order
        TreeMap<String,Integer>groceries=new TreeMap<>(); //will maintain in alphabetic order
        groceries.put("Eggs",10);//eggs is a key, 10 is value
        groceries.put("Milk",5);
        groceries.put("Bread",5);
        groceries.put("Rice",6);
        groceries.put("Meat",7);
        groceries.put("Soap",5);
        System.out.println(groceries.get("Rice")); //rice is a key  , so it will return a value of Rice
        System.out.println(groceries);
        groceries.isEmpty();
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("Meat");
        System.out.println(groceries);

    }
}
