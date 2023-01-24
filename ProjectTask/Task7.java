package ProjectTask;

public class Task7 {
    public static void main(String[] args) {
       // 7)Write a java program to check whether a given number is prime or not?
        int number=18;

        for (int i = 2; i <=number/2 ; i++) {
            if(number%2!=0){


                System.out.println("The number " +number+ " is Prime");break;
            }else{
                System.out.println("The number " +number+ " is not Prime");break;
            }
            
        }

    }
}
