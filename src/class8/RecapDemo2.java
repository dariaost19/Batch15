package class8;

import java.util.Scanner;

public class RecapDemo2 {
    public static void main(String[] args) {
        for (int a = 10; a >=2 ; a-=2) {
            System.out.println(a);

        }

        System.out.println("********************");
        // Replit 63
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        for (int a = 0; a <x ; a++) {
            System.out.print(a + " ");
            
        }
    }
}