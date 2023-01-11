package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        below line is reserving a box in computers memory.
        we are calling it box1 if we need the information we are storing inside this box
        we can simply say to the computer give us the contents of box 1.
        int=> what type of data
        box 1 => is the name of box
        = sign will take whatever we write after it and it will store it inside box
        10=> is what we are storing inside the box

         */
        int box1=10;
        // if you have to print something in the box do not put ""
        System.out.println(box1); // bring the contents of box 1 to the  console

        /*to store whole numbers(numbers without decimals points) we have 4 different types of boxes.
         for example numbers like 1,10,200,100000,etc.
         1)Byte (smallest one max number is  up to 127 , or  negative up to -128) )

        2)short (from 128 to to 32767 or negative from -128 to -32768)
          3)int most commonly used box in java
          4)long
         */

         byte box2=127;
         short box3=32767;
        int biggerBox=123456484 ;//most common type of the box
        long MaxBox=12256656989865651L ;// the most larger numbers , L suffix tells the compiler that we have a long number literal
        // Java byte , short , int and long types are used do represent fixed precision numbers
        /* Why L is used in long in Java?
         It appears that when you type in a number in Java,
          the compiler automatically reads it as an integer.



         */



        short myBox1=10000;
        System.out.println(myBox1);









    }
}
