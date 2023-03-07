package class26;

public interface TrustAble {
    int age=10; //constant
    String color="blue"; // instance variables( variable created in class)
public abstract int trust();
static void method1(){
    System.out.println("Hello World");

}
default void method2(){
    System.out.println("");
}


}
class Bank implements TrustAble{
    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }
}

