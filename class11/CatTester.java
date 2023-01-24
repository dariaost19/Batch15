package class11;

public class CatTester {
    public static void main(String[] args) {
        // We are creating object from Cat Class
        Cat cat1=new Cat();
        // access the attributes and assign it
        cat1.eat();
        cat1.speak();
        cat1.name="Lego";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.color="Grey";
        cat1.attitude=false;
Cat cat2=new Cat();
        cat1.name="Lucky";
        cat2.breed="Scotland";
        cat2.age=1;
        cat2.color="Grey";
        cat2.attitude=true;
        //How to print
        System.out.println(cat2.color);
    }
}
