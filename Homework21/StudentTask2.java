package Homework21;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class StudentTask2 {
    public static void main(String[] args) {
        //Create a Set collection that will hold Objects of Student Type.
        // In this set we do not care about the insertion order.
        // Each student object should have name and studentID. Display name of each student.
        HashMap<String,Integer> studentType=new HashMap<>();
        studentType.put("John",124564); // name is a key , numbers are values.
        studentType.put("Joe",124567);
        studentType.put("Marry",124457);
        studentType.put("Anna",145787);
        studentType.put("Olivia",578421);
        System.out.println(studentType);
        System.out.println(studentType.values());
        for (String s : studentType.keySet()) {
            System.out.print(s+" ");

        }

        }
     //   System.out.println(studentType.keySet());


  //for (Integer value : studentType.values()) {
       // System.out.println(value);
    }

