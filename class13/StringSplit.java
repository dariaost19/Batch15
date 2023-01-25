package class13;

public class StringSplit {
    public static void main(String[] args) {
        String str="I love java. I write a lot of code daily. I am from batch 15.";
        String [] strArr=str.split("[.?!]"); // to print how many sentences are present.
        System.out.println(strArr.length); //whenever we are working with Array we use length , and when we work with String we should use length()
        System.out.println(strArr[0]); //to print only first sentence
        System.out.println(strArr[1].trim()); // to print second sentence without space in the begging (using .trim)
    }
}
