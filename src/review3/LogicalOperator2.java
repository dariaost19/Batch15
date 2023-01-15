package review3;

public class LogicalOperator2 {
    public static void main(String[] args) {
        boolean dashboard=true;
        String message="Welcome admin";
        if(dashboard ||message.equals("Welcome admin")){
            System.out.println("User successfully login");
        }else{
            System.out.println("User is not logged in");
        }
    }
}
