package class13;

public class StringReplaceAll {
    public static void main(String[] args) {
        String str ="  KK646KKKKKKdfhHSaFSDGWdsds36964%$^@$()(0"; //remove all the numbers
        System.out.println(str.replaceAll("[A-Z]","#")); //we replace all upper case letter with #
        System.out.println(str.replaceAll("[a-z]","#")); //replace all lower case letters
        System.out.println(str.replaceAll("[0-9]","#")); //replace all numbers
        System.out.println(str.replaceAll("[A-Za-z]","#")); //replace upper and lower case letters
        System.out.println(str.replaceAll("[A-Za-z0-9]","#")); //replace all numbers and letters
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#")); // ^ not  // replace all special symbols
        System.out.println(str.replaceAll("[^A-Za-z0-9]","")); // remove smth specify empty " "

    }
}
