package class4;

public class NestIfDemo5 {
    public static void main(String[] args) {
        //Nested if condition when we store a box inside another box
        int money =1000;
        String day="Sunday";
        boolean mood=true;
        if (money>700){
            if (mood) {
                System.out.println("lets go shopping");
            }
        }
    }
}
