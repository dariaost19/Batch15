package Homework18;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new Lenovo(), new HP(), new DELL()};
        for (Computer computer : computers) {
            computer.internet();
            computer.memory();
            computer.speed();
            if (computer instanceof Apple) { // give us access to specific method of Apple class .We are checking if Variable computer contains tje object of Apple class.
                Apple apple = (Apple) computer; //type casting to have access to the methods that are present in Apple class only.
                apple.EditVideo();

            }

        }
    }
}

