package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        int number =10;
        System.out.println(number);
        // to rename something use right click Refactor->rename->enter.
        int age=20;
        age=number+10; //replace the value of age with value of number variable.
        System.out.println(age);
        age=age+20;
        System.out.println(age);
    }
}
