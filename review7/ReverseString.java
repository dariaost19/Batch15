package review7;

public class ReverseString {
        String reverse (String s){
            for (int i = s.length(); i >= 0; i--) {
                String str1 = "";
                str1 += s.charAt(i);

            }
            return s;
        }
        String reverseStr(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();

        }
    }

