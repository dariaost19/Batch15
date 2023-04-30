package class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("Artem");  //shift+F6 to rename all
        names.add("Elvira");
        names.add("Tamana");
        names.add("Temuz");
        names.add("Sam");
        System.out.println(names);
        for(String name:names){
            System.out.println(name);
        }
    }
}
