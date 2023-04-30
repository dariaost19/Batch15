package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer=new Integer(10); //boxing
        int number=integer; //autoUnBoxing
        int number2=integer.intValue();//unBoxing manual
      double d=12.3;
      Double wrapperD=new Double(d); //creating an object , Boxing
        Double wrapperP=12.5; //one way of AutoBoxing
        Double wrapperG=d; //another way of creating AutoBoxing
        Float f=12f;
        ArrayList<Float>arrayList=new ArrayList<>();
        arrayList.add(12.0f);
        double fg=12f;

    }
}
