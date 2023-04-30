package class12;

public class CarTester {
    public static void main(String[] args) {
        Car bmw=new Car(); //ClassName  ObjectName = new ClassName();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Grey";
        bmw.applyBrakes();
        bmw.moveForward(); // how we call method.

        Car audi=new Car();
        audi.make="Audi";
        audi.model="Q8";
        audi.year=2023;
        audi.color="Black";

        audi.moveForward();
        audi.applyBrakes();

    }
}
