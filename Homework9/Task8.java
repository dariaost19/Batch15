package Homework9;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {


        //Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate how many total countries been stored
        String[][] countries = {{"Canada", "Bahamas", "USA"},
                {"Brazil", "Peru", "Ecuador"},
                {"Poland", "Ukraine", "Germany", "France"},
                {"Thailand", "Philippines", "Cambodia"},
                {"South Africa", "Botswana", "Mauritius"},

        };
        int sumofcontries = 0;
        for (int i = 0; i < countries.length; i++) { ////how many 1d arrays are present
            for (int j = 0; j < countries[i].length; j++) { //  size of individual 1d array.
                System.out.print(countries[i][j]+ " ");

            }
            System.out.println();
        }


        for (String[] list : countries) {
            for (String newlist : list) {
                System.out.print(newlist + " ");

            }
            System.out.println();


        }
        for (int i = 0; i < countries.length; i++) { //how many 1d arrays are present
            for (int j = 0; j < countries[i].length; j++) { //  size of individual 1d array.
                sumofcontries++;
            }

        }
        System.out.println( "Total counties is :  " + sumofcontries);
    }
}




