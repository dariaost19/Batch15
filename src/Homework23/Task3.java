package Homework23;
//3) Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.

public class Task3 {
    public static void Age(int age){
        if(age<16){
            throw new RuntimeException("Age is less the 16");


        }

    }

    public static void main(String[] args) {
        int age=12;
        try {
            Age(age);
            System.out.println("Age is eligible");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
