package review5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101},
        };
        int numbersofArrays = array.length;
        System.out.println(numbersofArrays);
        int numbersofElementsin1Array = array[0].length;
        System.out.println(numbersofElementsin1Array);
        int numofElementin4Array = array[3].length;
        System.out.println(numofElementin4Array);
        //getting all values from 2D array.

        for (int[] Array1 : array) { //iterates over 1D array
            for (int arr : Array1) { //iterates over each element
                if (arr %2==0){
                    System.out.print(arr + " ");

                }

            }
            System.out.println();
        }
    }
}


