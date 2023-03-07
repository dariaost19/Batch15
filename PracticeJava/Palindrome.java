package PracticeJava;

import java.util.Scanner;

public class Palindrome {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("In:");
            String givenString = scan.nextLine();
                String reverse = "";
                boolean palindrome = true;
                for (int i = givenString.length() - 1; i >= 0; i--) {
                    reverse += givenString.charAt(i);
                }
                if (reverse.equalsIgnoreCase(givenString)) {
                   palindrome=true;
                } else {

                  palindrome=false;
                }
            }
        }


