package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {
        // create an array to store

        char [] letters = {'A', 'B', 'c', 'd', 'e', 'F'};
        letters[0]='z'; // updating variables

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}

