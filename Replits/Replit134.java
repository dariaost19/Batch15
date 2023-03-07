package Replits;

public class Replit134 {
    //Write a method with the following specs:
    //Returns:
    //an integer
    //Name:
    //countVowels
    //Parameters:`
    //a String called s
    //Purpose:
    //count the number of vowels in the string s.  Assume s is all lowercase.
    //Examples:
    //countVowels("obama") ==> 3
    //countVowels("happy friday! i love weekends") ==> 9
    int countVowels(String s){
        return (s.replaceAll("[^aeoui]","").length());
    }

}
class Replit133Replit{
    public static void main(String[] args) {
        Replit134 r=new Replit134();

        System.out.println(r.countVowels("obama"));
        System.out.println(r.countVowels("happy friday! i love weekends"));

    }

}
