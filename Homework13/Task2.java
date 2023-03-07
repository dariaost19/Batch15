package Homework13;

import class15.ReverseMethodPractice2;

public class Task2 {
    //2) Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
  public String reverseString(String str) {
        String newStr = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);

        }
        return newStr;
    }
    public static void main(String[] args) {

      Task2 tester=new Task2();
        System.out.println(tester.reverseString("Sunday"));
    }
}
