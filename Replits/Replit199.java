package Replits;
//Create a Set collection in which you want to preserve an order of inserted String Objects.
//Add the below values
//- null
//- Sohil
//- Diego
//- Alijon
//- Asel
//- Sumair
//Print values 1 by 1 using loop and Iterator
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Replit199 {
    public static void main(String[] args) {
        LinkedHashSet<String>name=new LinkedHashSet<>();
        name.add(null);
        name.add("Sohil");
        name.add("Diego");
        name.add("Alijon");
        name.add("Asel");
        name.add("Sumair");
        for(String s:name){
            System.out.println(s);
        }
        Iterator<String>iterator=name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
