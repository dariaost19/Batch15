package Review4;

public class ForLoopReview {
    public static void main(String[] args) {
        //For loop, we use when we know how many times to repeat a block of code
        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);

        }
        // We can use Break and Continue;
        for (int i = 2; i <= 20; i += 5) {

            System.out.println(i);
            if (i == 12) {
                System.out.println("i is equal to 12- a am breaking my loop");
                break; // stops /break the loop execution
            }
        }

        // Continue KeyWord
        for (int i = 1; i <=10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                continue; //java goes back to the beginning of the loop and skips the rest of the code that is inside the  loop body.
            }
            System.out.println("Hello");


        }
    }
}
