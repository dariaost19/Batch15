package class9;

public class ArraysDemo9 {
    public static void main(String[] args) {


        double[] arr = {10.5, 12.0, 45, 10.5, 23, 10.5};
        int count=0;
        //write  a program that will tell us how many times the number 10.5 is present in the array
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==10.5){
                count++; // increase the count // count=count+1;
            }
        }
        System.out.println(count);

    }
}
