package class10;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] numbers ={10,20,30,40,50};
        System.out.println(numbers[4]);
        System.out.println(numbers[1] + "  "+numbers[4]);
        for (int i = 0; i <5 ; i++) {
            System.out.print(numbers[i] +" ");

        }


        System.out.println("************************");


        for (int number:numbers){ // enhanced foreach  loop .whenever possible use this loop
            System.out.println(number);
        }
    }
}
