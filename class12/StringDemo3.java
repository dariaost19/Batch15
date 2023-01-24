package class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String str="hdfhd";
        System.out.println(str.isEmpty()); // if there are no input we will get true, otherwise false. counts even spaces.
        boolean isEmpty=str.isEmpty();

        System.out.println(str.isBlank()); // does not count spaces.
    }
}
