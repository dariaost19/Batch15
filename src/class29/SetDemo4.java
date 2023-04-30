package class29;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        //Stores date in increasing order
        TreeSet<Integer>number=new TreeSet<>();
        number.add(50);
        number.add(40);
        number.add(100);
        number.add(20);
        number.add(35);
        number.add(50);
        System.out.println(number);
    }
}
