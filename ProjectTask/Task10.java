package ProjectTask;

public class Task10 {
    public static void main(String[] args) {
        //0)Write a java program to find the second largest number in the array?
        int[] numbers={1,5,8,4,3};
        int secondLargest;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j =i+1; j < numbers.length ; j++) {
                if(numbers[i]>numbers[j]){
                    secondLargest = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = secondLargest;
                }

            }


        }
        System.out.println("The second largest number is " +numbers[numbers.length-2]);


    }
}
