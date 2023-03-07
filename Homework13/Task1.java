package Homework13;

public class Task1 {
    //1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.
   int sumArrayNumbers(int[]array){
      int sum=0;
       for (int num:array) {
           sum+=num;
       }
       return sum;
   }

    public static void main(String[] args) {
       Task1 tester=new Task1();
        int[] arr={10,20,30,40};
        System.out.println(tester.sumArrayNumbers(arr));


        }
    }








