package ProjectTask;

public class Task3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.
        int[][] numbers = { {1, 2, 3},{4, 5, 6}, {7, 8, 9}
        };
        int sum = 0;
        for (int[] i:numbers) {
            for (int j:i ) {

                sum += j;
            }
            System.out.println("The sum of  is :" + sum );
        }

            }
        }




