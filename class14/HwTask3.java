package class14;

public class HwTask3 {
    public static void main(String[] args) {
        //String a= "Is it saturday? Is it raining? Do we have a Java Class today?";
        //        String[] arr= a.split("[?]");
        //        System.out.println("There are total "+arr.length+" sentences in that String");
        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] arr=str.split("[?]");
        System.out.println(arr.length);
        System.out.println(arr[2]);
        System.out.println(str.split("[?]").length); // the best way to use it
    }
}
