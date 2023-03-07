package Replits;
//dd the follow values
//map.put("ONE","AAA");
//map.put("TWO","BBB");
//map.put("THREE","CCC");
//map.put("FOUR","DDD");
//map.put("FIVE","EEE");
//Using EntrySet print the key and values pairs using iterator only
//replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//Using EntrySet print the key and values pairs using iterator only
//OUTPUT
//HashMap Before Replace :
//FIVE : EEE
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : CCC
//------------------
//HashMap After Replace :
//FIVE : SUMAIR
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : ASEL

import Homework22.SumOfCollectionNum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Replit207 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        System.out.println("HashMap Before Replace :");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------");
        map.replace("FIVE","SUMAIR");
        map.replace("THREE","ASEL");
        System.out.println("HashMap After Replace :");
        Set<Map.Entry<String, String>> entrySet1 = map.entrySet();
        iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        }
    }


