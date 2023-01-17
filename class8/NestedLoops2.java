package class8;

public class NestedLoops2 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) { // we will see 10 lines
            for (int j = 0; j < 5; j++) { // we will see 5 stars , inner loop controle number of stars we see on console
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
