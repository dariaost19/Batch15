package class3;

public class IfElse_7 {
    public static void main(String[] args) {
        /*
        The if-else statement helps you to run a specific block of a program if the condition is true or else,
         it will check other conditions. It is used to control the flow or to determine the rules in a program.
         */

        // should be in () , and should end with {}
        // If the condition that we put inside () is true , java will execute your statement in print
        // if the condition inside () is false , java won't print anything on console.
        {

            int age = 17;

            if (age < 18)
                if (age >= 15) {
                    System.out.println( "You getting it");
                    {
                        System.out.println("Time to play"); // should be in {} after () if statement.
                        boolean inSyntaxBootCamp= true;
                        if(true)
                            if(inSyntaxBootCamp)
                            if(false)
/*
If conditions works based on boolean true or false if we have a true inside the if () it executes all the code inside the {}
If condition is false inside the () it want executes anything inside {}
 */

                        {
                            System.out.println("Time to start practicing java");
                        }
                        }

                    }
                }
        }
    }



