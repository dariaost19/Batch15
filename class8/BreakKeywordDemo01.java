package class8;

public class BreakKeywordDemo01 {
    public static void main(String[] args) {
        boolean summer =true;
        int temp=75;
        while (summer){
            if(temp<=100){
                System.out.println("I love summer because temperature is " +temp + " F");

            }else
            {
                System.out.println(" It is very hot because it is " +temp+ " F  outside");
                summer=false;

            }
            temp+=5;

        }
    }
}
