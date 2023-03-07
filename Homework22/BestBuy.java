package Homework22;

import java.util.HashMap;
import java.util.Map;

// Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
public class BestBuy {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy = new HashMap<>();

        // Add item IDs and names to the map
        bestBuy.put(7664847, "Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(7574544, "Laptop");
        bestBuy.put(8974644, "Scanner");
        bestBuy.put(7014879, "Camera");
        var entrySet = bestBuy.entrySet();
        for (var entry : entrySet) {
            System.out.println( entry.getKey() +" "+ entry.getValue());
        }

    }
}
