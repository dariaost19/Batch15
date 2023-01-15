package class7;

public class ForLoops2 {
    public static void main(String[] args) {
        // 1 2 4 5 7 8 10 11 13 14 16 17 19 write  all this numbers
        for (int i = 1; i < 20; i++) {
            if (i % 3!=0) {// this condition divides all the numbers by 3 and check if remainder is 0.

                System.out.println(i);
            }

        }
    }
}


