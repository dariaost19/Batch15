package Homework11;

public class Task4v2 {
    public static void main(String[] args) {
        String str="This is the string i want to reverse";
        String[] str1=str.split(" ");

        String reverse="";
        for (String word:str1) {
            StringBuilder stringBuilder=new StringBuilder(word);
            stringBuilder.reverse();
            reverse=reverse+stringBuilder.toString()+" ";
        }
        System.out.println(reverse);
    }

    }

