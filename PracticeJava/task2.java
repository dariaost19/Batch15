package PracticeJava;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {


        String[][] cars = {{"American:", "Ford", "GMC"},
                {"German:", "BMW", "Mercedes"},
                {"Korean:", "KIA", "Hyunday"},
        };
        for (String[] car : cars) {
            System.out.println((Arrays.toString(car)));
        }
        System.out.println("Method 2");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(Arrays.toString(cars[i]));
        }
    }
}

