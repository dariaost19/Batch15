package class13;

public class Task3 {
    public static void main(String[] args) {
        // get the baby name from mom and dad
        String dadsName="Daniel";
        String momsName="Mary";
        String expectation="Boy";
        if(expectation.equalsIgnoreCase("boy")){
            String firstHalf=dadsName.substring(0,dadsName.length()/2);
            String secondHalf=momsName.substring(momsName.length()/2);
            System.out.println(firstHalf+secondHalf);
        }
    }
}
