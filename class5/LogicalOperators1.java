package class5;

public class LogicalOperators1 {
    // || or operator
    public static void main(String[] args) {
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println(false||true|false|false);
        boolean bougthCho=false;
        boolean boughtFlowers =false;
        if(bougthCho||boughtFlowers){
            System.out.println("I am happy");
        }else{
            System.out.println("I am Sad");
        }
        boolean wifi=false;
        boolean fiveG=false;
        if(wifi||fiveG){
            System.out.println("You are good browsing the internet");
        }else{
            System.out.println("Connect to 5G or wifi");
        }

    }
}
