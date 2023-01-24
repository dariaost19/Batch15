package Replits;

public class Replit75 {
    public static void main(String[] args) {
        //Using the following array.
        //
        //{45, 78, 12,  67, 55, 89, 23, 77, 88}
        //
        //Create a for loop to extract values from that array so your output looks as below:

        int[] numbers={45, 78, 12,  67, 55, 89, 23, 77, 88};
        for(int i=0;i<numbers.length;i++){
            if(i==1 || i==4 || i==7)

                System.out.print(numbers[i]+" ");

        }
    }
}
