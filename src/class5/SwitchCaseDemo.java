package class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {
      /*
      Switch Case statement are same as if else conditions
      It is another way of achieving the same results as if -else -if conditions
      It is a faster and simple method to use instead if-else-if
      Syntax :
      String variable:
      switch(variable)
      case 1:
      sout
      break;
      default
       */
       int day=9;
       switch (day){
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Wrong day");


       }

    }
}
