package Replits;
//

public class Replit131 {
    String thirdLetter(String s){
        String str="";
        for (int i = 0;i <s.length() ; i+=3) {

     str+=s.charAt(i);
        }
     return str;
    }


    public static void main(String[] args){
        Replit131 r=new Replit131();
        System.out.println(r.thirdLetter("hello there")); //"hltr"
        System.out.println(r.thirdLetter("technology")); //"thly"
    }



}
