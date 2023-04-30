package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        //Tre Set does not allow duplicates and also make it in alphabetic order
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
