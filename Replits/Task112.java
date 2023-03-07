package Replits;

public class Task112 {
    //Create a method in which you will be printing numbers from 1 to 10
    //
    //2. Call the method in the main method
    void printNumbers(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        Task112 tester=new Task112();
        tester.printNumbers();
    }
}
