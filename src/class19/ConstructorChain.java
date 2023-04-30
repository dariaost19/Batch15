package class19;

import java.util.concurrent.Callable;

public class ConstructorChain {
    ConstructorChain(){
        System.out.println("I am non argument constructor");
    }
    ConstructorChain(String str){
        this(); //calling constructor with no parameters.(non-argument constructor)
        //this () -> always must be on the first  line.
        System.out.println(str);
    }
    ConstructorChain(String str,int number){
        this(str);
        System.out.println("This is a constructor with int parameter");

    }

    public static void main(String[] args) {

ConstructorChain obj =new ConstructorChain("hello",10);
        System.out.println("************** END OF CODE ***************");



    }
}
