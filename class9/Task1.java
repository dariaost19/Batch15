package class9;

public class Task1 {
    public static void main(String[] args) {
        // option 1
        for (int i = 1; i <=50 ; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i+ " ");
            
        }
        // option 2
        for (int i = 1; i <=50 ; i++) {
            if(i%3!=0){
                System.out.print(i+" ");
            }

        }
    }
}
