package review5;

public class fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        for (int i = 1; i <=10 ; i++) {
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;

        }
    }
}
