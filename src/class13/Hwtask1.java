package class13;

public class Hwtask1 {
    public static void main(String[] args) {
        //print the middle letter from the string
        String str="Hello";
        if(!str.isEmpty()){
            if(str.length()%2!=0 &&str.length()>3){
                int middle=str.length()/2;
                System.out.println(str.charAt(middle));
            }
        }
    }
}
