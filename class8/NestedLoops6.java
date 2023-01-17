package class8;

public class NestedLoops6 {
/*
  0 1 2 3 4 5
  1 2 3 4 5
  2 3 4 5

 */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <= 5; j++) {
                    System.out.print(j + " ");

                }


                System.out.println();

            }

        }
    }



