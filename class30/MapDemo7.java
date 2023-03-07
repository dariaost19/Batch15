package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap=new HashMap<>();
        studentMap.put(1,"Nezir");
        studentMap.put(2,"Shah");
        studentMap.put(3,"Tami");
        studentMap.put(4,"Aisha");
        studentMap.put(5,"Gul");
        studentMap.put(6,"Bahar");
        studentMap.put(7,"Saba");
        // to get key and value
        Set<Entry<Integer,String>>entrySet=studentMap.entrySet(); //this method give us set which contain the object of the Entry class
        for(Entry<Integer,String> entry:entrySet){
         //   System.out.println(entry.getKey());
          //  System.out.println(entry.getValue());
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        //remove all entries with letter i and if key is greater then 2
        entrySet.removeIf(x->x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(studentMap);



    }
}
