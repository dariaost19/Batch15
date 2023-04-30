package class20;

public class ParentTester {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.name="Jonh";
        p.hello();
        Parent.bye(); // static non access modifier
    }
}
