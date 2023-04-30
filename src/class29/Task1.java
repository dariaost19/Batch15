package class29;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Anush");
        names.add("Manshu");
        names.add("Kanshu");
        names.add("Panshu");
        names.add("DananShu");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Saud"));
        System.out.println(names.contains("Anush"));
        System.out.println(names.size());
        System.out.println(names);
        for (String n:names){
            System.out.print(n+" ");
        }
    }
}
