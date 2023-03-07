package Replits;

public class CarObjects {
    //Create instance variables as below.
    //- model
    //- price,
    //- quantity
    //Create a constructor that will initialize instance variables.
    //Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.
    //run the application in Main Class
    //**Expected Output:**
    //Toyota 2019 Stock Value 2500000.0
    //BMW 2019 Stock Value 652980.0`
    //Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
    String model;
    double price;
    int quantity;

    int year;
    CarObjects(String model,int year,int quantity){
        this.model=model;
        this.year=year;
        this.quantity=quantity;
    }
    double carStockValue(double price, int quantity){
        this.price=price;
        this.quantity=quantity;
        double stockValue=price*quantity;
        return stockValue;
    }

}
class Main1 {
    public static void main(String[] args) {

        CarObjects ob = new CarObjects("Toyota", 2019, 100);
        CarObjects ob1=new CarObjects("BMW",2019,120);
        System.out.println(ob.model+" "+ob.year+" Stock Value "+ob.carStockValue(25000,100));
        System.out.println(ob1.model+" "+ob1.year+" Stock Value "+ob1.carStockValue(65298.0,10));

    }
}


