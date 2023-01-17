package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(i%3==0||i==6 ||i==9) { // or just put i%3==0
                continue; // skip all numbers that are divided by 3 with no remained. 3, 6, 9
            }else{
                System.out.println(i); // this line will never execute when i=3, 6 , 9

            }


        }
    }
}
