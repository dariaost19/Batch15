package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        //does not allow duplicates and also retain the insertion order
        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
