package Homework23;
//4) Create a method checkUserName that will throw a runtime exception.
// Method should throw an exception when entered username is less than 5 characters.

public class Task4 {
    public static void checkUserName(String username) {
        if (username.length() < 5) {
            throw new RuntimeException("username is less then 5 characters");

        }
    }

    public static void main(String[] args) {
        String username = "abracadabra";

        try {
            checkUserName(username);
            System.out.println("Username is valid");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            // In other words, it returns the error message associated with the exception that was thrown.
        }
    }
}
