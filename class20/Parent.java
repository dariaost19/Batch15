package class20;

public class Parent {
    String name;
    static String lastName;
    public void hello(){
        System.out.println("hello from parent class");

    }
    protected static void bye(){
        System.out.println("protected method bye from parent class ");

    }
    private void money(){
        System.out.println("private method from parent class");

    }
}
