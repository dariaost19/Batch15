package class12;

public class StringDemo6 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startWith=str.startsWith("I"); //checking if String starts with letter I .
        System.out.println(startWith);
        System.out.println(str.endsWith("java"));
        System.out.println(str.toLowerCase().startsWith("i"));
        //only String could be change in the method.


    }
}
