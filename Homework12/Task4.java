package Homework12;

public class Task4 {
    //4)Create a method that will say Hello in different language based on the country that will passed when method is executed
    String language (String country){
        switch (country){
            case "USA":
                return "Hello";
            case "Chinese":
                return "nǐn hǎo";
            case"French":
                return "bonjour";
            case "Ukraine":
                return "Dobryy Den`";
            case "Italy":
                return "salve";
            default:
                return "unknown";



        }

    }


}
