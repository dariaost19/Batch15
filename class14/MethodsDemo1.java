package class14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodsDemo1 {
    public static void main(String[] args) {
       /* String str="is";
        str="that"; // re-assigning the value.
        */
        int[] arr1 = {10, 20, 30, 45, 50};
        int sum=0;
        for (int number:arr1) { //enhanced for loop
            sum+=number;
        }
        System.out.println(sum);
      //  System.out.println(Arrays.toSting(arr1));
        int []arr2={10,20,30,45,50};
        int sum2=0;
        for (int number:arr2) {
            sum2+=number;
        }
        System.out.println(sum2);

    }
}

