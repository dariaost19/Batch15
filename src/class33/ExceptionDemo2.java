package class33;

import java.util.SortedMap;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        System.out.println("Line 6");
        try {
         //   System.out.println(10/0);
            String str="Java";
            str.charAt(10);
            //here we put the code which might throw an error
       //   String name=null;
//            //backup code, solution according to the problem
        }catch (NullPointerException npe ){
            System.out.println("We are trying to access a method on a null object");

        }catch (ArithmeticException ae){
            System.out.println("someone is trying to access a 0 object");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        System.out.println("Line 7");
        System.out.println("Line 8");
        System.out.println("Line 9");
        System.out.println("Line 10");
    }
}