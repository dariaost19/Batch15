package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> makeUp = new HashMap<>();
        makeUp.put("Lipstick", 50.0);
        makeUp.put("Foundation", 40.0);
        makeUp.put("Mascara", 70.0);
        makeUp.put("Eyeliner", 12.2);
        makeUp.put("Blush-on", 15.2);
        //to get all keys we can use keySet Method from Map interface
        Set<String> allKeys = makeUp.keySet();
        System.out.println(allKeys);
        //delete all entries from the map for which the size of the key is greater than 7
            allKeys.removeIf(x->x.length()>7); // to remove all keys that have 7 or more letters
            System.out.println(allKeys);
            System.out.println(makeUp);



    }
}
