package review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.99);
        fruitMap.put("Dragon Fruit", 5.6);
        fruitMap.put("Pear", 16.5);
        fruitMap.put("Orange", 15.5);
        fruitMap.put("Mango", 10.6);
        //print only those elements which contains letter "a" "or "e" and the price is more than 8$
        var entrySet=fruitMap.entrySet();
        for (var fruits : entrySet) {
            String fruitName = fruits.getKey();
            Double price = fruits.getValue();
            if ((fruitName.contains("a") || fruitName.contains("e")) && price > 8.0) {

                System.out.println(fruits);
            }

        }

    }
}

