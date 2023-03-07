package Homework15;

public class ATester {
    public static void main(String[] args) {


        A a = new A();
        a.day="Saturday";
        a.date="February 4";
        a.Date();
        System.out.println("**********************");

        B b=new B();
        b.date="February 4";
        b.day="Saturday";
        b.weather="Cold but Sunny";
        b.GoodDay();
        b.Date();

        System.out.println("*************************");
        C c=new C();
        c.date="February 4";
        c.day="Saturday";
        c.time="3:06";
        c.TimeoftheYear();
        c.Date();
        c.GoodDay();


    }
}
