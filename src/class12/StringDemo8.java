package class12;

public class StringDemo8 {
    public static void main(String[] args) {
        String str="Java is love";
        char c=str.charAt(0); // help us to get all the characters one by one
        System.out.println(c);
        for (int i = 0; i <str.length() ; i++) { // to print all characters from string
            System.out.print(str.charAt(i)+" ");


            }
        System.out.println();
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                counter++;

            }

        }
        System.out.println(counter);

        }

        }


