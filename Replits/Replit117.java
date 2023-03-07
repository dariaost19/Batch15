package Replits;

public class Replit117 {
    //Create a method with the following specs:
    //Returns:
    //an integer
    //Name:
    //sumEvenToX
    //Parameters:
    //an integer called "x"
    //Purpose:
    //calculate the sum of the EVEN integers from 1 to x (including x)
    int SumEvenToX(int x){
        int count=0;
        for (int i = 1; i <=x ; i++) {
            if (i % 2 == 0) {
                count+=i;
        }

        }
        return count;
    }

    public static void main(String[] args) {
        Replit117 tester=new Replit117();
        System.out.println(tester.SumEvenToX(5));
    }
}
