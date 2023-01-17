package HomeWork4;

import java.util.Scanner;

public class HWTask3 {
    public static void main(String[] args) {
      /*  Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F

       */
        Scanner my =new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        double quiz= my.nextDouble();
        System.out.println("Please enter your mid term score");
        double midterm= my.nextDouble();
        System.out.println("Please enter your final score");
        double finalscores= my.nextDouble();
        double overage=((quiz+midterm+finalscores)/3);
        if(overage>=90){
            System.out.println("A");
        }
        if(overage>=70 &&overage<90){
            System.out.println("B");
        }
        if(overage>=50 && overage<70){
            System.out.println("C");
        }
        if (overage<50){
            System.out.println("F");
        }


    }
}
