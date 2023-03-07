package Replits;

public class Replit122 {
    //Declare 3 instance variables to hold:
    //
    //- name of the country
    //- capital
    //- population size
    //
    //Create a method to display values of instance variables
    //
    //Create 2 Object, assign values to instance variables, execute method display;
    //The capital of USA is Washington DC and population is 330000000
    //The capital of Kazakhstan is Astana and population is 18500000
    String nameOfCountry;
    String capital;
    int population;

    public static void main(String[] args) {
        Replit122 country1 =new Replit122();
        country1.nameOfCountry="USA";
        country1.capital="Whinghton DC";
        country1.population=330000000;
        System.out.println("The capital of "+country1.nameOfCountry+" is " +country1.capital+" and population is "+country1.population);

        Replit122 country2=new Replit122();
        country2.nameOfCountry="Kazakhstan";
        country2.capital="Astana";
        country2.population=18500000;
        System.out.println("The capital of "+country2.nameOfCountry+" is " +country2.capital+" and population is "+country2.population);

    }
}
