package Homework23;
//2) Create a static method that will return a List of Exceptions.
//Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//Call your method inside main and print name and details of all Exception objects.

import org.apache.commons.math3.exception.MathArithmeticException;
import org.bouncycastle.i18n.MissingEntryException;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<Exception> list() {
        List<Exception> exceptionList = new ArrayList<>();

        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            exceptionList.add(e);
        }

        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            exceptionList.add(e);
        }

        try {
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptionList.add(e);
        }

        try {
          int a=Integer.parseInt("hfg");

        } catch (NumberFormatException e) {
            exceptionList.add(e);
        }

        return exceptionList;

    }
    public static void main(String[] args) {
        List<Exception> exceptionList = list();

        for (Exception e : exceptionList) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }


}
