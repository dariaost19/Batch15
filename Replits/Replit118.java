package Replits;

public class Replit118 {
    //Write a method header on line two with the following specs:
    //Returns:
    //a String
    //Name:
    //spaceOut
    //Parameters:`
    //a String
    //Then complete the method by programming the following behavior
    //Insert spaces after every character in the String s, then return the new string.
    String spaceOut(String a){
        String space=(a.replace(""," "));
return space;
    }

    public static void main(String[] args) {
        Replit118 tester=new Replit118();
        System.out.println(tester.spaceOut("mama"));
    }
}
