package review7;

public class MinimumValue {
    //create a method that return a minimum value from the given array
    int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < i) {
                min = array[i];
            }

        }
        return min;

    }


    }

