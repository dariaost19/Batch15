package class16;

public class TernaryOperator {
    public static void main(String[] args) {
        int number=0;
        if (3 > 2) {
            number=10;
        } else {
            number=20;
        }
        System.out.println(number);

        System.out.println("**********************");

      number=(3>2)?10:20; //second way to write the above code without using if condition
        System.out.println(number);
        number=(3>2)?(4>5)?10:20:15;
        System.out.println(number);
    }
}
