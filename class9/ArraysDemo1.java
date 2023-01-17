package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {
        String[] names = {"Slava", "Safi", "Jason", "Nabi", "Anees", "Joseph"}; // names numbers starts from 0.
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}