package Replits;
//Create a set collection in which you do not want to preserve or sort the order and add below values to it.
//Red
//Pink
//Yellow
//White
//Black
//Print set collection
//And get total number of colors available in the set

import java.util.HashSet;

public class Replit197 {
    public static void main(String[] args) {
        HashSet<String>colors=new HashSet<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        System.out.println(colors.size());

    }
}
