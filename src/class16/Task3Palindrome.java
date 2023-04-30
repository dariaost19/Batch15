package class16;

public class Task3Palindrome {
    //is string palindrome or note ?
    // return type Void (because we only need to print it)
    //name
    //parameters =>String

void isPalindrome(String str){   //creating method
    StringBuilder st=new StringBuilder(str);
    st.reverse();
    String reversed=st.toString();
    if(str.equals(reversed)){
        System.out.println(str+" is palindrome");
    }else{
        System.out.println(str+ " is not palindrome");
    }

}

    public static void main(String[] args) {      //creating an object
    Task3Palindrome task=new Task3Palindrome();
       task.isPalindrome("Kaya");

    }
}
