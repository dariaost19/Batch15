package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap=new HashMap<>();
        studentMap.put(1,"Nezir");
        studentMap.put(2,"Anush");
        studentMap.put(3,"Tami");
        studentMap.put(4,"Aisha");
        //remove key and value is greater than 2
        Set<Integer> allKeys = studentMap.keySet();
        System.out.println(allKeys);
        allKeys.removeIf(x->x>2);
        System.out.println(allKeys);
        System.out.println(studentMap);
    }
}
