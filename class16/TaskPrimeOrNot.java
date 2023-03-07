package class16;

// Prime or Not?
// return type => boolean
//name => IsPrime
// parameters => int number

public class TaskPrimeOrNot {
    Boolean number(int num) {
        boolean prime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

        }
        return prime;
    }

    public static void main(String[] args) {
     TaskPrimeOrNot tester=new TaskPrimeOrNot();
        System.out.println(tester.number(12));
    }
}
