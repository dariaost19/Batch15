package Homework12;

public class Task3 {
    //3) Create a method that will print whether given String is palindrome or not.
    String str(String word) {
        String newStr = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newStr += word.charAt(i);
        }
        if (newStr.equalsIgnoreCase(word)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        return newStr;
    }


}




















