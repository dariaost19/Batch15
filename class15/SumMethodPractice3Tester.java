package class15;

public class SumMethodPractice3Tester {
    public static void main(String[] args) {
        SumMethodPractice3 mp3=new SumMethodPractice3();
        int[] array={10,20,30};
        System.out.println(mp3.arraysum(array));
        System.out.println(mp3.arraysum(new int[]{10,20,30}));  // another way of printing results

    }
}
