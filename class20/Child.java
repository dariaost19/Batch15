package class20;

public class Child extends Parent {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.hello();
        c1.bye(); //static
        Child.bye(); //access to static method
        Parent.bye(); //access to static method
      //   c1.money (); private
        c1.name="George";
        Child.lastName="Washington";
    }

}
