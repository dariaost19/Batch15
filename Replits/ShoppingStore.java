package Replits;

    //Create variables as below.
    //- item,
    //- price,
    //- quantity
    //Create a constructor to initialize instance variables.
    //Create a method with name itemTotalPrice.
    //write a logic to to calculate the total values of items in stock. and print the result.
    //return the total value.
    //**In Main Class.**
    //Create two Object of ShoppingStore and pass the parameters to Constructor.
    //then using each object call the method itemTotalPrice.
    //Store the returned value of each object.
    //Calculate sum of both object and print the result.
    //Output:
    //Blanket Total Value 99.98
    //Mattress Total Value 439.18
    //You purchased 539.16 Today
    //Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.
    class ShoppingStore{

        String item;
        double price;
        int quantity;
        ShoppingStore(String item,double price,int quantity){
            this.item=item;
            this.price=price;
            this.quantity=quantity;

        }
        double itemTotalPrice(double price,int quantity){
            double totalValue=price*quantity;

            return totalValue;
        }

    }
class Main2 {
    public static void main(String[] args) {
        ShoppingStore s = new ShoppingStore("Blanket", 99.98, 1);
        ShoppingStore s1 = new ShoppingStore("Mattress", 439.18, 1);
s.itemTotalPrice(99.98,1);
s1.itemTotalPrice(439.18,1);
        System.out.println(s.item+" Total Value "+(s.price*s.quantity));
        System.out.println(s1.item+" Total Value "+(s1.price*s1.quantity));
        System.out.println("You purchased "+(s.itemTotalPrice(99.98,1)+s1.itemTotalPrice(439.18,1)));

    }
}


