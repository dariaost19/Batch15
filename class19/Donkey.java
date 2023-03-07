package class19;

public class Donkey {
    String name;
    int age;
    double weight;
   // Donkey(){
   //     System.out.println("this is non argument constructor");
   // }
    Donkey(String name,int age){
        this.name=name; // this refers to the current instance
       this.age=age;

    }
    void print(){
        System.out.println("Donkey`s name " + name +" age : "+ age+ " and weight  is " + weight);
    }
}
