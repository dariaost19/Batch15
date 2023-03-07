package class21;

public class Animal {
    String name;
    String color="black";

}
class cat extends Animal{
   String color="white"; //to access black color;
    int age;
    double weight;
    void printColor(){
        String color="blue";
        System.out.println(super.color); //to access black
        System.out.println(this.color); //to access white
        System.out.println(color); //to access blue
    }

}
class AnimalTester{
    public static void main(String[] args) {

        cat c=new cat();
       c.printColor();

    }
}
