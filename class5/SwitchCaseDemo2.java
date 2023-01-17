package class5;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        String day="Saturday";
        switch (day){
            case"Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case"Wednesday":
                System.out.println("3");
                break;
            case"Thursday":
                System.out.println("4");
                break;
            case"Friday":
                System.out.println("5");
                break;
            default:
                System.out.println("Does not match");

        }
    }
}
