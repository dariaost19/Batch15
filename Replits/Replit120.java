package Replits;

public class Replit120 {
    //Declare 3 instance variables to hold:
    //
    //year, school name and batch #
    //
    //Access variables from the main method and assign specific values to them
    //
    //Print values of your variables in the following format:

        int year;
        String school;
        String name;
        String batch;


    public static void main(String[] args) {
        Replit120 tester=new Replit120();
        tester.year=2023;
        tester.school="Syntax";
        tester.name="Daria O";
        tester.batch="Batch15";
        System.out.println("I am a student of "+tester.batch+ " studying at "+tester.school+ " in the year of "+tester.year);
    }


}
