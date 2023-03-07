package class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str="Java";
        String str2="JAVA";
        boolean equal=str.equals(str2);
        System.out.println(equal);
        System.out.println(str.equals(str2));
        boolean areequal=str.equalsIgnoreCase(str2);
        System.out.println(areequal);

    }
}
