package Replits;
//Create a Hash Map of String pairs
//add the follow values
//map.put("ONE","AAA");
//map.put("TWO","BBB");
//map.put("THREE","CCC");
//map.put("FOUR","DDD");
//map.put("FIVE","EEE");
//Using entry set print key and values pairs using loop
//Remove below from Map
//"ONE"
//"FOUR"
//Using entry set print key and values pairs using loop
//HashMap Before Remove :
//FIVE : EEE
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : CCC
//------------------
//HashMap After Remove :
//FIVE : EEE
//TWO : BBB
//THREE : CCC

import Homework22.SumOfCollectionNum;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Replit206 {
    public static void main(String[] args) {
        HashMap<String, String> x = new HashMap<>();
        x.put("ONE", "AAA");
        x.put("TWO", "BBB");
        x.put("THREE", "CCC");
        x.put("FOUR", "DDD");
        x.put("FIVE", "EEE");
        Set<Map.Entry<String, String>> entrySet = x.entrySet();
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        x.remove("ONE");
        x.remove("FOUR");
        Set<Map.Entry<String, String>> entrySet1 = x.entrySet();
        for (var entry : entrySet1) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }
}

