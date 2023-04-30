package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {
  PracticeMethod callThisMethod=new PracticeMethod();
  callThisMethod.isEven(15);
      boolean isEven= callThisMethod.isEven(15);
        System.out.println(isEven);

        System.out.println("******************");

        PracticeMethod callMethod = new PracticeMethod();
        boolean isEven1 = callMethod.isEven(100);
        boolean isEven2 = callMethod.isEven(12);
        boolean isEven3 = callMethod.isEven(20);
        System.out.println(isEven1);
        System.out.println(isEven2);
        System.out.println(isEven3);


    }
}
