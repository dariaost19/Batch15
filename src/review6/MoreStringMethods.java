package review6;

import java.util.SortedMap;

public class MoreStringMethods {
    public static void main(String[] args) {
        String myString="Today is February 2";
        myString.split(" ");
        String[]strArray=myString.split(" ");
        for(String s:strArray) {
            System.out.println(s);
        }

            System.out.println(" ************************************  ");
            System.out.println(myString);

           String newmyString= myString.substring(9);
        System.out.println(newmyString);
        String newMyString=myString.substring(9,17);
        System.out.println(newMyString);
       int index= newMyString.indexOf('b');
        System.out.println(index);

        String anotherString="Today is Thursday";
        index=anotherString.indexOf("Thursday");
        System.out.println("index of Thursday is = "+index);
        }
    }

