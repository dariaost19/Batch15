package class24;

 public abstract class Animal {
    abstract void Speak();
   abstract void Eat();
}
class Dog extends Animal{
    @Override
    void Speak() {
        System.out.println("Dog can bark");
    }

    @Override
    void Eat() {
        System.out.println("Dog like meat");
    }
}
class Cat extends Animal{
    @Override
    void Speak() {
        System.out.println("Cat can Meow Meow");
    }

    @Override
    void Eat() {
        System.out.println("Cats like fish");
    }
}
class Horse extends Animal{
    @Override
    void Speak() {
        System.out.println("Horse can neigh");
    }

    @Override
    void Eat() {
        System.out.println("Horse eat grass");
    }
}
