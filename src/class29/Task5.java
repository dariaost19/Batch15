package class29;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <=500 ; i++) {
            numbers.add(i);

        }
        numbers.removeIf(x->x%5==0);
        System.out.println(numbers);
    }
}
