package review6;

public class stringBuilderExample {
    public static void main(String[] args) {
        //this class is n=mutable
        //collection of characters
// all the changes happens on the same object
        StringBuilder sb = new StringBuilder("Hello");
sb.reverse(); //proves that stringBuilder is mutable
        System.out.println(sb);
       String str= sb.toString(); // convert stringBuilder to string (immutable variable)
        str.toUpperCase(); //proves that String is immutableD
        System.out.println(str);


    }
}

