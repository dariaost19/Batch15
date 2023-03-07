package review6;

import javax.crypto.spec.PSource;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1)); //we hava to pass numeric value of index
       String newStr= str.concat(" Friends");
        System.out.println(newStr);
        System.out.println(str);
        str=str.toLowerCase();
        System.out.println(str);

       String str1="  Review Batch 15";
       String newStr1=str1.trim(); //remove any white spaces
        System.out.println(str1);
        System.out.println(newStr1);


    }
}
