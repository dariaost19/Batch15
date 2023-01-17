package Homework8;

public class Task2 {
    public static void main(String[] args) {
        //2) Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).
        String[]names={"Abdul","Daria","Nelson","Natalia", "Asli","Hiral","Tarik","Adem","Abeera","Dina","Slava"};
        System.out.println(names[1]);

        String[]names1=new String[11];
        names1[0]="Abdul";
        names1[1]="Daria";
        names1[2]="Nelson";
        names1[3]="Natalia";
        names1[4]="Asli";
        names1[5]="Hiral";
        names1[6]="Tarik";
        names1[7]="Adem";
        names1[8]="Abeera";
        names1[9]="Dina";
        names1[10]="Slava";
        System.out.println(names[1]);


    }
}
