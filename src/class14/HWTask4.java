package class14;

public class HWTask4 {
    public static void main(String[] args) {
        //4) How would you reverse a String word by word? for example
        //        //        // input=>This is sentence i want to reverse
        //        //        // output=>sihT si ecnetnes i tnaw ot esrever
        //  StringBuilder st=new StringBuilder("this is the sentence i want to reverse");
        // System.out.println(st.reverse());
        //  String str =st.toString(); // converting a Stringbuilder to String so that we can call method from String.
        String str1 = "This is the sentence i want to convert";
        String[] arr = str1.split(" "); // converting sentence into array of words
        for (String word : arr) {
            for (int i = word.length()-1; i >=0; i--) {

                System.out.print(word.charAt(i));
            }

            System.out.print(" ");

           /* String word = "This"; //reverse single word
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));*/

            }
        System.out.println();

        for(String word:arr){ //second way using stringbuilder.
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }
        String str="This is sentence i want to reverse";
        String [] arr1=str.split(" ");
        }
    }


