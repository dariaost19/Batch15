package class12;

import java.util.Scanner;

public class CredentialChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter username");
        String username = scan.nextLine();
        System.out.println("Please enter password");
        String password = scan.nextLine();
        System.out.println("Please confirm password");
        String confirmpassword = scan.nextLine();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("User name and password can not be empty");
        }

        //Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.
        //
        //Only after all requirements met → message “Your username and password has been created”

        if (password.length() <8) {
            System.out.println("Password too short");
        } else if (password.contains(username)) {
                System.out.println("Cannot contain username");
            } else if (!password.equals(confirmpassword)) {
                System.out.println("Password do not match");

            } else {
                System.out.println("Your username and password has been created");
            }
        }
    }

