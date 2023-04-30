package review6;

public class Garden {
    void hello() {
        String name = "Adem";
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
     // static  String str; // local variable , can not use static with local variables.
        // System.out.println(name); local variable since it can not be visible outside of Hello

    Flower flower1 =new Flower(); //new object is created , flower referring variable
    Flower flower2= new Flower();
    Flower flower3= new Flower();
    //accessing variables from Flower class
    flower1.name="Hibiscus";
    flower1.color="red";
    flower1.price=5;
    //accessing methods of Flower class
    flower1.bloom();
    flower1.grow();
    flower1.smell();
    flower1.pretty=false;
        System.out.println(Flower.pretty); // correct way accessing static variable
        //System.out.println(flower1.pretty);

        System.out.println("creating second object of the flower class");

        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.bloom();
        flower2.grow();
        flower2.smell();

        //variabke i it is local to its block of code -loop
        for (int i =1; i <=3 ; i++) {
        System.out.println(i);

        }
       // System.out.println(i); local variable not visible outside the block.(loop)


//In summary, the class is a blueprint for creating objects (instances of that class). It defines a set of attributes (instance variables) and behaviors (methods) that an object of that class can have.
// An object is an instance of a class. You create an object by calling the constructor of the class, which is a special method that sets up the initial state of the object.
// A method is a block of code that performs a specific task. It can accept parameters, return a result, or both.
    }
}
