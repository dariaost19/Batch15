package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Send it to support channel. More java";
        String newstr=str.substring(28); // how to skip everything till the 28 characters , it counts spaces as well.
        System.out.println(newstr);
        System.out.println(str.substring(0,27)); // specifying a starting and ending point. and we are getting part that we need

    }
}
