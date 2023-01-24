package class12;

public class StringDemo {
    public static void main(String[] args) {
        String strObj=new String("Java"); // we are creating an object of String class.
        String strObj2="Java"; // another way of creating an object (Shorter way).the mostly used one.
        System.out.println(strObj2.length());
        String fruit="Banana ";
        int len=fruit.length();
        System.out.println(fruit.length()); // method that we use to calculate number of characters in our string(fruit)
        System.out.println(len); // same way to calculate.
        String name="Rafik Gfhe";
        if (name.length()>10){
            System.out.println("Name cant be more than 10 letters");
        }
    }
}
