package class14;

public class MathTester {
    public static void main(String[] args) {
        Math math=new Math();
        math.AddingNumbers(10,10);
        math.Mul(10,10,10);

        int result=math.sub(100,50);
        System.out.println(result);
    }
}
