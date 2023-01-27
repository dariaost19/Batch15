package review5;

import java.util.Scanner;

public class Arraywithscanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many names you want to store");
        int size= scan.nextInt();
        String []name=new String[size];
        for (int  i= 0;  i<name.length ; i++) { //regular loop works with indexes
            System.out.println("please enter the name");
           name[i]= scan.next();

        }
     // using loop below we can retrieve element
        //works with variables
        for(String names:name){
            System.out.print(names+" ");
        }
    }
}
