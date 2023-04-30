package class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
            ArrayList<String> names=new ArrayList<>(); // we have created an array list of String
            //<> diamond operator or angle brackets, we have to specify the datatype inside it.
            // add method to add elements to this array
            names.add("Nelson"); //ctrl + d duplicate the line
            names.add("Sam");
            names.add("Diana");
            names.add("Zahra");
            names.add("Daria");
            names.add("Saba");
        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
