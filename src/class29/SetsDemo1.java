package class29;

import java.util.HashSet;

public class SetsDemo1 {
    public static void main(String[] args) {
        HashSet<String>fruit=new HashSet<>();
        //Hashset does not allow duplicate values and does not maintain insertion order
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
