package ProjectTask;

public class Task9 {
    public static void main(String[] args) {
        //9)Maximum and minimum number in the array?
        int[] numbers={1,5,8,4,3};
        int max=numbers[0];
        int minimum=numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i]>max){
                max=numbers[i];
            }else if(numbers[i]<minimum) {
                minimum=numbers[i];


            }

        }
        System.out.println(" This is the minimum number  "+minimum);
        System.out.println("This is the largest number " +max);
        }
}
