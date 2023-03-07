package class20;

public class BaseClass {
    String name="John";
    void hello(){
        System.out.println("hello method from Base class");
    }
}
class Child1 extends BaseClass{
    String name="Jane";
    void callMe(){
        System.out.println(name);
        System.out.println(super.name); //referring to immediate parent
    }
    void hello (){
        System.out.println("hello from child class");
    }
    void callingParentMethod(){
        hello();
        super.hello();  //referring to parent class method
        System.out.println("hello method  from parent class ");
    }

}
