package class16;

public class Student {
    String name;
    String id;
   static String SchoolName; // if we use static java will declare this variable and it is going to store in only one memory  location.
    int age;
    double weight;
    void printName(){ //instance method is everything without static
     //   System.out.println(name); cant access here
        System.out.println(SchoolName); //another way that you might see a lot to access static variables
    }

}
