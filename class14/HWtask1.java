package class14;

public class HWtask1 {
    public static void main(String[] args) { //delete all spaces from string
        String str="Batch 15 is great";
        String newstr=str.replaceAll(" ","");
        System.out.println(newstr);
    }
}
