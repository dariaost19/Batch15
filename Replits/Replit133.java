package Replits;

 class Replit133 {
     int count;
     char c;
     String s;
     //Create a static method with the following specs:
     //Returns:
     //an integer
     //Name:
     //countA
     //Parameters`
     //a String called s
     //Purpose:
     //count the number of occurrences of 'a' or 'A' within s
     //test case below (dont change):

     static int countA(String s) {
         int count;
         char c = 'a';
         char c1 = 'A';
         count=0;
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == c || s.charAt(i) == c1) {
                 count++;

             }

         }
         return count;
     }

        public static void main (String[]args){


            System.out.println(countA("aaA")); //3
            System.out.println(countA("aaBBdf8k3AAadnklA")); //6
        }
    }











