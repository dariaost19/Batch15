package Replits;

public class Replit85 {
    public static void main(String[] args) {
        //Write a program that sums all numbers that are on even index and on even row.
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int sum=0;
        int total=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(j%2==0 && i%2==0){
                    sum=sum+a[i][j];
                    total++;

                }

            }

        }
        System.out.println(sum);

    }
}
