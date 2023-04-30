package class30;
//reate a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map

import Homework20.Insurance;

import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<Integer,String>building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Microsoft");
        building.put(4,"Tesla");
        building.put(5,"Google");
        building.put(6,"Amazon");
        building.put(7,"Meta");
        System.out.println(building);
        System.out.println(building.size());
        System.out.println(building.replace(4,"NVIDIA"));
        System.out.println(building.remove(7));
        System.out.println(building);
    }
}
