package Replits;

 class Replit177 implements Output {

     double adding(double firstNumber, double secondNumber) {
         return firstNumber + secondNumber;
     }

     double substracting(double firstNumber, double secondNumber) {
         return firstNumber - secondNumber;
     }

     double multiply(double firstNumber, double secondNumber) {
         return firstNumber * secondNumber;
     }

     double dividing(double firstNumber, double secondNumber) {
         return firstNumber / secondNumber;
     }

     public void display() {
         System.out.println(adding(100,20));
         System.out.println(dividing(100,20));
         System.out.println(substracting(100,20));
         System.out.println(multiply(100,20));


     }

     public static void main(String[] args) {
      Output r=new Replit177();
      r.display();


     }
 }


    interface Output {
        void display();
    }
    interface Input{

    }
    interface Function extends Output {
        double adding();
        double substracting();
        double multiply();
        double dividing();


    }

