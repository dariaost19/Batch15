package Replits;

public class Parent3 {
    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child5 extends Parent3 {

    void m1(){
        super.m1();
        System.out.println("m1 method in child class");}

    void m2(){
        System.out.println("");

    }

}
