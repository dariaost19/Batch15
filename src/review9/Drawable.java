package review9;

public interface Drawable { //collection of public static final variables and public abstract methods
    public static final String Tool="Pencil"; //by default this method is public static final variable
    void draw(); // by default this method is public static final variable abstract
    default void print(){
        System.out.println("We are drawing object using "+Tool);
    }
    static void erase(){
        System.out.println("i can erase");
    }

}
abstract class Shape{
    String color;
    double width, length;
    Shape(String color,double length,double width){
        this.color=color;
        this.length=length;
        this.width=width;

    }
    public abstract double calculateArea();

}
class Rectangle extends Shape implements Drawable{
    @Override
    public double calculateArea() {
        return length*width;
    }
    Rectangle(String color,double length,double width){
        super(color,length,width);
    }

    public void draw(){
        System.out.println("i am drawing a Rectangle");
    }
}
class Square implements Drawable{
    public void draw(){
        System.out.println("I am drawing a Square");
    }
}
