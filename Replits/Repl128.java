package Replits;

public class Repl128 {
    //Create a static method with the following specification
    //
    //Return Type: String
    //
    //Method Name: mixString
    //
    //Parameters:
    //
    //- a String called s1
    //- a String called s2
    //
    //Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.
    String s1;
    String s2;


    static String mixString(String s1,String s2){
       StringBuilder sb=new StringBuilder();

            for (int i = 0; i < s1.length(); i++) {
                sb.append(s1.charAt(i)).append(s2.charAt(i));
            }
        return sb.toString();

        }



    public static void main(String[] args){


        System.out.println(mixString("12345","abcde"));
        System.out.println(mixString("howdy","hello"));
}

    }
