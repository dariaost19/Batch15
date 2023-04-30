package class24;

public final class FinalDemo {
    public static void main(String[] args) {
        final int num; //declare variable;
        num=10; //assign a value to it. With final, we can not change it.
     //   num=30;  not possible because variable is declared as Final.

    }
   final  void noOneShouldOverrideIt(){
        System.out.println("This method should never be overridden");
    }
}
//class Nelson extends FinalDemo{  can not inherit when a parent class is final
    //We can not override this method as it is declared as Final.
  /*  void noOneShouldOverrideIt() {
        System.out.println("Let me do it");
    }

   */

