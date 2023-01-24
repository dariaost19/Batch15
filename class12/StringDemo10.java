package class12;

public class StringDemo10 {
    public static void main(String[] args) {
        //This method will tell us index/location of character.
String str="Java is not pain";
        System.out.println(str.toLowerCase().indexOf("J")); //-1 of character is not present
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("p"));
        for (int i = 0; i <str.length() ; i++) { //loop to get all indexes from String
            System.out.println(str.charAt(i)+" has the index " +i);

        }

    }
}
