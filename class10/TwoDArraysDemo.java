package class10;

import java.util.Arrays;

public class TwoDArraysDemo {
    public static void main(String[] args) {
        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","Zahra"};
        // 2D array which can hold 3 of 1D arrays ( each of size 3).

        String [][] train1=new String[3][3]; //[] second could be empty, or you can put the number from first[]
        train1[0]=cabin0;
        train1[1]=cabin1;
        train1[2]=cabin2;
        //  In the First  pair of [] we specify the address of 1D array.
        System.out.println(train1[1][1]);
        // to print all names from train 0 (which contain cabin 0)
        System.out.println(Arrays.toString(train1[0]));

    }
}
