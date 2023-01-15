package review3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtomDisplayed=true;
        boolean loginButtomClickable=false;
        if (loginButtomDisplayed&&loginButtomClickable){
            System.out.println("Test case is passed");
        }else{
            System.out.println("Test case failed");
        }
    }
}
