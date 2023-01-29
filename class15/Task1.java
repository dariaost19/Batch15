package class15;

public class Task1 {
    //Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
    String createEmail(String Firstname, String Lastname,String emailType ){
        String completeEmail=Firstname+Lastname+"@"+emailType+ ".com";
        return completeEmail.toLowerCase();

    }

    public static void main(String[] args) {
        Task1 email=new Task1();
        System.out.println(email.createEmail("Daria","Ostrenko","gmail"));
    }
}


