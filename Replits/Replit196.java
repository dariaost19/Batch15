package Replits;

import java.util.HashSet;
import java.util.LinkedHashSet;

//Create a Set and and below values to it.
//[third, first, second]
//Print HashSet and then remove all the elements from Hashset and print it again.
//**Expected Output:**
//[third, first, second]
//[]
public class Replit196 {
    public static void main(String[] args) {
       LinkedHashSet<String>set=new LinkedHashSet<>();
        set.add("third");
        set.add("First");
        set.add("Second");
        System.out.println(set);

       set.clear();
        System.out.println(set);

    }
}
