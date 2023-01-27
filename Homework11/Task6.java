package Homework11;

public class Task6 {
    public static void main(String[] args) {
        //6) How would you swap  2 strings without a temporary variable?
        String str="summer";
        String str2="time";
        System.out.println(str + " "+ str2 );
        str=str+str2; //append str and str2 , now str =summertime.
        str2= str.substring(0, str.length()-str2.length()); //store initial value of str in to value of str2. str=summertime now we have to subtract a part of it.
        //in this case it will take a part of str from 0 to the length of the string str.it will exclude this particular word
        str= str.substring(str2.length()); //store initial str2 in to str
        System.out.println("After swapping str to str2 : " + str +" " +str2);
    }
}
