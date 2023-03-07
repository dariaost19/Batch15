package review6;

public class Flower {
    //attributes,properties
    String color,name;
    int price;

    //static variable -class level variable
    static boolean pretty=true;

    //behavior defined the behavior with methods
void smell(){
        System.out.println(name+" smells good");
    }
    void bloom(){
        System.out.println(name+" flowers bloom");
    }
    void grow(){
        System.out.println(name+" flowers grows");

    }
}
