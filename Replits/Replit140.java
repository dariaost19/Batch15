package Replits;

public class Replit140 {
    //Create the maxLength method that will accept String array of words and return the word with the largest length.
    //
    //Method should visible only within same package!
    String maxLength(String []arr){
        String longest=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>i){
                longest=arr[i];
            }
            
        }

return longest;
    }

    public static void main(String[] args) {
        Replit140 r=new Replit140();
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(r.maxLength(arr));
    }
}
