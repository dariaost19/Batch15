package review5;

public class TwoDArrayreviewRegularLoop {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101},
        };
        //getting all values from 2D Array using regular for loop
        for (int row = 0; row < array.length; row++) { //iterate over each row (initialization, condition ,then java goes inside if condition is true it keeps
            // incrementing until condition is false)
            for (int column = 0; column < array[row].length; column++) { //iterate over each column
                if (row % 2 != 0) {
                    System.out.print(array[row][column] + " ");

                }


            }
            System.out.println();
        }
    }
}
