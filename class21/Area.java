package class21;

import Homework15.A;

public class Area {
    //Create 1 class in which create a methods that will calculate the area of
    //Rectangle
    //Square
    int length;
    int width;
    int side;
    void CululateArea(int length,int width){
        System.out.println(length*width);
    }
    void CulculateArea(int side){
        System.out.println(side*side);


    }

    public static void main(String[] args) {
        Area a=new Area();
        a.CulculateArea(5);
        a.CululateArea(4,8);
    }
}
