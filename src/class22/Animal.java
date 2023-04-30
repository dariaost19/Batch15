package class22;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("animals can speak");
    }
    void eat(){
        System.out.println("all animals eat");
    }

}
class Cat extends Animal {

    void speak() {
        super.speak();
        System.out.println("meow meow"); //overriding
    }

    void printName() {
        System.out.println(name);
    }
}
class Dog extends Animal{

}
class Tester{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.speak();


    }

    }


