package class27;

public class Demo1 {
    public static void main(String[] args) {
        String name="Zafar";
        String name2="Nalson";
        String name3="Sarah";
        String []names={"Hiral","Nima","Laura","Nat"};
        displayNames(names); //since it is static method and we are in same class we can call method directly.
        displayNames1(name,name2,name3);
    }
    public static void displayNames(String[]names){
        for(String name:names){
            System.out.println(name);
        }
    }
    public static void displayNames1(String name,String name2,String name3){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

    }
}
