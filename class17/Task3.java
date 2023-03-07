package class17;

public class Task3 {
    // Create a method that will accept a String as a parameter
    //and return a new String that consist only of vowels.
    //Method should be available inside the class only
    //where it was declared and executed by calling it is name.*/
private static String vowel(String iput){
    return iput.replaceAll("[^AOIEUaeioeu]","");
}

    public static void main(String[] args) {
        vowel("Daria");
        System.out.println(vowel("Daria"));
    }
}
