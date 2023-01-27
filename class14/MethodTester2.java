package class14;

public class MethodTester2 {
    public static void main(String[] args) {
    MethodsDemo2 md=new MethodsDemo2(); //creating an object of the class.
    md.printHello(); // this is how we call the method

        System.out.println("***************");


        md.printHelloManyTimes(2);
        System.out.println("*****************");
        md.printManyTimes(5,"I love Java"); //passing
    }
}
