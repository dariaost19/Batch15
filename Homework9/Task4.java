package Homework9;

public class Task4 {
    public static void main(String[] args) {
        //2) Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops
        String[][] cars = {{"Ford", "GMC", "Chevy"},
                {"Mercedes", "Audi", "BMW"},
                {"Kia", "Hyundai", "Genesis"},
                {"Ferrari", "Maserati", "AlfaRomeo"},
        };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

            }
            System.out.println();
        }


            for (String[]arr:cars){
                for (String a:arr) {

                    System.out.println(a);
                }
                System.out.println();

            }


        }

    }

