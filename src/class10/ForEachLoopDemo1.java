package class10;

public class ForEachLoopDemo1 {
    public static void main(String[] args) {
        // print only the odd numbers from this array
        int[] arr={10,13,20,25,45,50};
        /*arr[1]=0;
        arr[3]=0;
        arr[4]=0;

        */
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==1){
                System.out.println(arr[i]);

        }
        } //updating value of odd numbers with 0
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==1){
                arr[i]=0;
            }
        }
        System.out.println("After replacing the odd numbers to 0");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");

        }



    }
}
