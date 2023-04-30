package class21;

//Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

public class PrivateTask3 {
    private void B(String str){
        System.out.println(str);
    }
    private void B(String str,String str1){
        System.out.println(str+ " "+str1);
    }
    private void B(String str,int b){
        System.out.println(str +" "+b);

    }

    public static void main(String[] args) {
        PrivateTask3 t=new PrivateTask3();
        t.B("Monday", 7);
        t.B("Monday", "February 7");
        t.B("Monday");
    }
}
