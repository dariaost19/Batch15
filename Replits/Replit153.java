package Replits;

public class Replit153 {
    //In Parent Class.
    //Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
    //Create another constructor that takes one parameter of integer type called number.
    //include the logic to print the value of the number.
    //In Child class.
    //Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
    //Overload the constructor by adding one parameter of type integer
    //Inside the constructor call the parameterized parent class constructor.
    //In Main Class.
    //Create an object of Child without passing any argument.
    //And then another object of Child class by passing the value "10". run the application.
    //**Expected Output:**
    //Parent Constructor without argument
    //Child Constructor without argument
    //10
    int number;
  Replit153(){
      System.out.println("Parent Constructor without argument");
  }

    public Replit153(int number) {
        this.number = number;
    }

    void print(){
        System.out.println(number);
    }
}
class Child1 extends Replit153{
    int number2;
    Child1(){

        System.out.println("Child Constructor without argument");
    }

     Child1(int number, int number2) {
        super(number);
        this.number2 = number2;
    }

    public static void main(String[] args) {

    }
}

