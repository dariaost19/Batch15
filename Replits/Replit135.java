package Replits;
//Return a new String built from s that has every instance of the search term surrounded by parentheses
//See below examples.
//Examples:
//surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
//surround("technology",'o') ==> "techn(o)l(o)gy"


public class Replit135 {
    String surround(String s){
        return s.replaceAll("c","(c)");

    }
    String surround2(String s){
        return s.replaceAll("o","(o)");
    }



    public static void main(String[] args) {
        Replit135 r=new Replit135();
        System.out.println(r.surround("abcabcabc")); //"ab(c)ab(c)ab(c)"
        System.out.println(r.surround2("technology")); //"techn(o)l(o)gy"
    }
}
