package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap=new HashMap<>();
        studentMap.put(1,"Nezir");
        studentMap.put(2,"Anush");
        studentMap.put(3,"Tami");
        studentMap.put(4,"Aisha");
        studentMap.put(5,"Gul");
        studentMap.put(6,"Bahar");
        studentMap.put(7,"Saba");
        Collection<String>values=studentMap.values();
        System.out.println(values);
        //remove all values that contains letter I ,i
        values.removeIf(x->x.contains("I")||x.contains("i"));
        System.out.println(values);

    }
}
