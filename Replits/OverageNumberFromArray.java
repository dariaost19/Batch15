package Replits;

public class OverageNumberFromArray {

        public static void main(String[] args) {
            int[] a = {2,7,3,8,4};
            System.out.println(avgElements(a));
        }
        final static  double avgElements(int []arr){
            double sum = 0;
            for(int i:arr)
                sum += i;
            return sum/arr.length;
        }

    }


