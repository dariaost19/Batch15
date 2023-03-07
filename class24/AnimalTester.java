package class24;

public class AnimalTester {
    public static void main(String[] args) {
      //  Animal a = new Animal();
        Animal[]arr={new Cat(),new Dog(),new Horse()};
        for(Animal animal:arr){
            animal.Eat();
            animal.Speak();
        }

    }
}




