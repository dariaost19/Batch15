package Replits;

public class Arr {
    //Complete static sum2D method by writing an accumulator algorithm that will calculate the sum of all the element in the 2D array passed as a parameter.
    //You know how to do this.
    //You know how to do an accumulator algorithm with a 1-D array.  Now it's "loop through all the elements of the 2-D array" instead of "loop through all the elements of the 1-D array".  You know how to loop through a 2-D array.  You got this.
    //**In Main Class:**
    //Create relation between Main class and Method by making Main class as a subclass of the Method Class
    //Use Array:
    //and execute sum2D method

    int[] a = {1, 2, 3};
    int sum=0;

int Sum() {
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
    return sum;

    }
}
class Arr2 extends Arr{
    int []b={4,5,6};

}
class Arr3 extends Arr{
    int c[]={7,8,9};
}
class Main3{
    public static void main(String[] args) {
        Arr2 a=new Arr2();
        a.Sum();
        Arr aa=new Arr();
        aa.Sum();
        Arr3 aaa=new Arr3();
        aaa.Sum();
        System.out.println((a.Sum())+(aa.Sum())+(aaa.Sum()));

    }
}


