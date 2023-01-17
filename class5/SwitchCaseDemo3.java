package class5;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {

        char gender = 'f';
        switch (gender){
            case'F':
            case 'f':
                System.out.println("Female");
                break;
            case'M':
            case'm':
                System.out.println("Poor male");
                break;
            default:
                System.out.println("not specified");
        }
    }
}
