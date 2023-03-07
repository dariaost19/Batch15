package Replits;

public class Replit168Reverese {

        public static void main(String[] args) {

            Task f=new Task();
            System.out.println(f.reverse("hello"));
        }
    }
    class Task{
        final String  reverse (String s){
            String str = " ";
            for (int i = s.length()-1; i >= 0; i--) {

                str += s.charAt(i);

            } return str;

        }
    }

