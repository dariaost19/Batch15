package Class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country ="ukraine";
        System.out.println(country.toLowerCase());
        switch(country.toLowerCase()){ // convert the text to lower case USA ->usa
            case"usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afganistan":
                System.out.println("Kebab");
                break;
            case"ukraine":
                System.out.println("Borshch");
                break;
            case "china":
                System.out.println("Rice");
                break;
            default:
                System.out.println("Wrong counrty");

        }
    }
}
