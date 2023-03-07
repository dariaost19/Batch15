package Replits;

public class Replit136 {
    //Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one
    //In each method write the logic accordingly like for private method write the logic in the println Statement as
    // "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a total of 4 outputs,
    // please make sure they are in the same order that is printed below.

    //This is Private Method`
    //This is Default Method`
    //This is Protected Method
    //This is Public Method
    private void Print(){
        System.out.println("This is a Private method");
    }
    void Print1(){
        System.out.println("This is default method");

    }
    protected void Print2(){
        System.out.println("This is Protected method");
    }
    public void Print3(){
        System.out.println("This is public method");
    }

    public static void main(String[] args) {
        Replit136 r=new Replit136();
        r.Print();
        r.Print1();
        r.Print2();
        r.Print3();
    }
}
