package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        //Type casting is What is type casting in Java?
        //Type casting is when you assign a value of one primitive data type to another type.
        long number =125;
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num =(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);
        /*
        byte
        short
        int
        long
        float
        double

         */
        int b=10;
        int number2=b;
        short c=(short) number2;

        /*
        If we try to store the contents from the smaller box to a larger box Java does not complain because the content can easily fit inside the larger box.
        If we try other way around we will get ab error and we need to type cast it to store the contents.
         */

        System.out.println(c);
        float eggs =12.5f;
        int wholePart =(int)eggs; //type casting we are converting(conversing) from float to an int.
        System.out.println(wholePart);
        System.out.println((char)98); // we are converting Chat to character using ASCI table.


    }
}
