package Class6;

public class WhileLoop08 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 16)
        {
            if(number%5!=0) // so 5/5 =1 , 10/5= 2, 15/5 =3 which means numbers are even.
            System.out.println(number);
            number++;

        }
    }
}
