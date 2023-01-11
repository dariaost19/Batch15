package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName= "Daria ";
        String lastName= "Ostrenko";
        System.out.println(firstName+ lastName);
        // to print with a space (firts name +"space" +last name)
        System.out.println(firstName+ " "+lastName);
        //Java executes from top to bottom but if we have multiple operations on the same line
        // it will execute them from left to right.
        // If you want to put any signs when printing simply put in " ".
        System.out.println("First name="+firstName);
        System.out.println("Last name= "+lastName);
        System.out.println("10"+"10");
        // only + is working with String
        System.out.println(firstName+ " "+ lastName);
        // CTRL+ Z reverse your step back

        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);





    }
}
