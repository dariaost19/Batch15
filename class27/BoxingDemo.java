package class27;

public class BoxingDemo {
    public static void main(String[] args) {
        int number=15;
        printData(number);
        Integer f=10; //auto boxing
        int number2=f; //boxing


    }
    public static void printData(Integer number){ //wrapper class
        System.out.println(number);

    }
}
