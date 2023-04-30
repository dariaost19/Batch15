package class12;

public class StringDemo9 {
    public static void main(String[] args) { // We count how many letter are present in String
        String str = "kfjhhj 12545576895 $%&*";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                counter++;

            }
        }
        System.out.println("Total alphabets in Str: " + counter);
        System.out.println();



        for (int a = 0; a < str.length(); a++) { // how many digits are present
            if (Character.isDigit(str.charAt(a))) {
                counter++;


            }
        }
        System.out.println( "The total digits is : " +counter);
    }
}

