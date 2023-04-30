package class30;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",2.99);
        fruit.put("Banana",4.99);
        fruit.put("Kiwi",0.99);
        fruit.put("Apple",3.99);
       // fruit.put(null,null); you could put null as a key and value as well
        System.out.println(fruit);
        HashMap<String,Double>makeUp=new HashMap<>();
        makeUp.put("Lipstick",50.0);
        makeUp.put("Foundation",40.0);
        makeUp.put("Mascara",70.0);
        makeUp.put("Eyeliner",12.2);
        makeUp.put("Blush",15.2);

        HashMap<String ,Double>groceries=new HashMap<>();
        groceries.putAll(fruit); //combine all Maps in one and print it
        groceries.putAll(makeUp);
        System.out.println(groceries);

    }
}
