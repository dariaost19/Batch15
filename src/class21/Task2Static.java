package class21;
//Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.


public class Task2Static {
    static void A(int a, int b){
        System.out.println(a+b);

    }
    static void A(double a, int b){
        System.out.println(a+b);
    }
    static void A(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Task2Static.A(2,5);
        Task2Static.A(4.00,5);
        Task2Static.A(1,2,3);
    }
}
