package class19;

import review6.Flower;

public class Furniture {
    String type;
    double price;
    String color;

// with the help of constructor we can initialize object with specific value

    Furniture(String type,double price,String color){
        this.type=type;
        this.price=price;
        this.color=color;

    }
  void   Furniture(){

    }
    //void Furniture is a method with name Furniture , because of return type.


    void PrintInfo(){
        System.out.println(type+ price+color);
    }
}
