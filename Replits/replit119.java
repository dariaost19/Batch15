package Replits;

public class replit119 {
    // Returns:
    //String
    // Name:
    // censorLetter
    // Parameters:
    // a String
    //  a char
    //Then complete the method by programming the following behavior
    // Replace all instances of given character with a "*" within the given String.
    //censorLetter("computer science",'e') ==> "comput*r sci*nc*"
    //censorLetter("trick or treat",'t') ==> "*rick or *rea*"
    String censorLetter(String a, char c) {

       String str = a.replaceAll(String.valueOf(c),"*"); //convert char value to string it takes value of char
        return str;
    }


    public static void main(String[] args) {
        replit119 tester=new replit119();

        System.out.println( tester.censorLetter("computer science",'e'));
        System.out.println(tester.censorLetter("trick or treat",'t'));
    }
}
