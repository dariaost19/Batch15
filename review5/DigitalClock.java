package review5;

public class DigitalClock {
    public static void main(String[] args) {
        for (int h1 = 0; h1 <= 2; h1++) {
            for (int h2 = 0; h2 <= 9; h2++) {
                if (h1 == 2 && h2 == 4) {
                    break;
                }

                for (int min = 0; min <= 59; min++) {
                    if (min < 10) {
                        System.out.println(h1 + "" + h2 + ":0" + min);
                    } else {
                        System.out.println(h1 + "" + h2 + ":" + min);
                    }

                }
            }
        }
    }
}



