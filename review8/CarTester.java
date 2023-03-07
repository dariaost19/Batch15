package review8;

import PracticeJava.T;

public class CarTester {
    public static void main(String[] args) {
    Bmw bmw=new Bmw("Bmw","X7");
    bmw.brake();
    bmw.start();
        Tesla tesla=new Tesla("Tesla","Y",2022,300,"electric",true);
        tesla.drive(75);
        tesla.start();


    }
}
