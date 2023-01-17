package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
        boolean summer=true;
        int temperature =75;
        while (summer){
            if (temperature<=100){
                System.out.println("I love summer because temperature is " + temperature+ " F ");
            }else{
                System.out.println("It is very hot " + temperature +" F " );
                break;
            }
            temperature+=5;
        }
    }
}
