package ProjectTask;

public class Task5 {
    //5)Create a 2D array of integers. Develop a program which will calculate the sum of
    // even and odd numbers for that array.
    public static void main(String[] args) {
        int[][] numbers = {{1, 8, 3}, {11, 5, 6}, {7, 12, 9}
        };
        // sum odd=36
        //sum even =26
        int Evensum=0;
        int OddSum=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++)
                if (numbers[i][j] % 2 == 0) {
                    Evensum=Evensum+numbers[i][j];
                    System.out.println("THe sum of even numbers is : "  +Evensum);

                }else{
                    OddSum=OddSum+numbers[i][j];
                    System.out.println("The sum of Odd Numbers is : " +OddSum );

            }
        }
    }
}
