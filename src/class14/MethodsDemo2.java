package class14;

public class MethodsDemo2 {
    void printHello(){ //defining the method.

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

    }
    void printHelloManyTimes(int times){
        for (int i = 0; i <times ; i++) {
            System.out.println("Hello world");
        }

    }
    void printManyTimes(int time,String word){ //defining
        for (int i = 0; i <time ; i++) {
            System.out.println(word);
        }

    }

}
