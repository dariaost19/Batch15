package Homework11;

public class Task2 {
    public static void main(String[] args) {
        //2) Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        String str="ABCD abcd 1234 #&()";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isAlphabetic(str.charAt(i)))
            count++;


        }
        System.out.print( "The number of Alphanumeric characters is : "+count);

    }
}
