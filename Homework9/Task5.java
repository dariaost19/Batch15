package Homework9;

public class Task5 {
    public static void main(String[] args) {


        //3) Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops
        String[][] grocerylist = {{"Cucumbers", "Tomato", "Celery", "Arugula"},
                {"Oranges", "Mango", "Apples", "Pear"},
                {"Cheese", "Milk", "Yogurt",},
                {"Cookie", "Chocolate", "Cheese Danish", "Blueberry Pie "},
        };
        for (int i = 0; i < grocerylist.length ; i++) {
            for (int j = 0; j < grocerylist[i].length ; j++) {
                System.out.println(grocerylist[i][j]);

            }
            System.out.println();

        }
        for(String[]list:grocerylist){
            for(String x:list){
                System.out.println(x+" ");

            }
            System.out.println();
        }


    }
}
