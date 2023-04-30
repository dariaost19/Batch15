package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        var c='a';
        var name="Aladdin";
// longer way for removing elements from arrayList, works on Java 6-19
        //method will return an object
        //check if any elements are left to continue iteration
        //return elements one by one
        //checking condition
        /*
        while(iterator.hasNext()){ //check if any elements are left to continue iteration
            String s=iterator.next(); //return elements one by one
            if(s.endsWith("a")){ //checking condition
                iterator.remove();
            }
         */
        words.removeIf(s -> s.endsWith("a")); //does not work in Java 7
        System.out.println(words);
    }
}
