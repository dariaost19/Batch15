package class15;

public class ReverseMethodPractice2 {
    // create a method that takes a string , reverse it and return the reverse String.
    // call the Method reverseStr
    String reverseString( String str){
        String newStr=" ";
        for (int i =str.length()-1; i >=0 ; i--) {
           newStr+=str.charAt(i);

        }
        return newStr;
 //Another way to create
   /*     String reverseStr1(String input){
            return new StringBuilder(input).reverse().toString();
        }

        String reverseStr2(String input){
            StringBuilder stringBuilder=new StringBuilder(input);
            stringBuilder.reverse();
            return stringBuilder.toString();
        }
*/
    }
}
