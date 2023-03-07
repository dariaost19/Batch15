package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
       numbers.add(20.0);
        numbers.add(30.5);
       numbers.add(40.5);
        numbers.add(10.3);
//Using Lambda Expression to remove numbers.
      //  numbers.removeIf(number1 -> number1 > 11); //Lambda Expression
      Iterator<Double> iterator= numbers.iterator(); //created variable with the type iterator.
// we are getting object og iterator
       /* System.out.println(iterator.hasNext()); //it is elements left, we can move forward to call next element
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(numbers);*/
        //hasNext() keeps returning true as long as there are elements left to be iterated.
        while (iterator.hasNext()){
          double number=  iterator.next();
          if(number>11){
              iterator.remove();
          }

        }
        System.out.println(numbers);

    //   for (Double number : numbers) {
       // if (number > 11) {
      //  numbers.remove(number);// we can not remove or all elements inside Arraylist with help of for loop.
            }
            // we can not remove or all elements inside Arraylist with help of for loop.
        }



