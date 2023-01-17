package class5;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
       Logical  operators help us combine things.
        Only work with booleans.
        1 2 3 4 5 6 7 8 9 10      15

         */
        // ! not Operator
        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);
        int number =9;
        if(number!=1)
        {
            System.out.println("Hello!");
        }else {
            System.out.println("Hello java!");
        }
        String country ="China";

        if(!country.equals("Bad Counrty"));{
            System.out.println("You are welcome");
        }
        if(country.equals("China")){
            System.out.println("You are welcome");
        }

    }
}
