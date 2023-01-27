package review5;

import java.lang.reflect.Array;

public class ArrayReview {
    public static void main(String[] args) {
int []arr=new int[3];
arr[0]=10;
arr[1]=20;
arr[2]=30;
        System.out.println(arr[2]);
        System.out.println(arr.length);

        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
        System.out.println();
        for (int numbers:arr) {
            System.out.print(numbers+" ");

        }
        System.out.println();
        String []colors={"white","black","red","purple","pink"};
        for (int i = 0; i < colors.length ; i++) { //for each loop
            System.out.print(colors[i]+" ");

        }
        System.out.println();
        for(String color:colors){ //enhanced loop
            System.out.print(color+" ");
        }

        System.out.println("printing in reverse");

        for (int i = colors.length-1; i >=0 ; i--) {
            System.out.print(colors[i]+" ");

        }
    }
}
