package review11;

import java.util.HashMap;
import java.util.Map;

public class RemoveFromEntrySet {
    public static void main(String[] args) {
        Map<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.99);
        fruitMap.put("Dragon Fruit", 5.6);
        fruitMap.put("Pear", 16.5);
        fruitMap.put("Orange", 15.5);
        fruitMap.put("Mango", 10.6);
        fruitMap.forEach((x,y)-> System.out.println(x +" "+y)); //will return you each element ine by one
        // x is for key
        // y is for value
        //remove those elements with letter a , e and price is more 10

        //we are using remove if method to remove the elements from the set -> part of Syntax of Lambda expression
        fruitMap.entrySet().removeIf(entry->
                (entry.getKey().contains("a") || entry.getKey().contains("e")) && entry.getValue() > 8);

        System.out.println(fruitMap);
    }
}
