package Replits;

public class Replit109MethodCall3Times {
    //Create method name it as newLine
    //
    //2. Add print statement inside method body as "newLine method implementation"
    //
    //3. Call newLine method three times
    void newLine(){
        System.out.println("newLine method implementation");
    }

    public static void main(String[] args) {
        Replit109MethodCall3Times tester=new Replit109MethodCall3Times();
        for (int i = 0; i <3 ; i++) {
            tester.newLine();

        }
    }
}
