package class13;

public class StringRecap {
    public static void main(String[] args) {
        String str = "Java is Great"; //print all the letter one by one from a string
       //the input is INT , output is a char
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // to count how many times letter A is present
        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println( "Letter A is present " +count);
    }
}
