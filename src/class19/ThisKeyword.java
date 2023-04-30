package class19;

public class ThisKeyword {
    int a,b;
    ThisKeyword(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void sum(int a,int b){
        System.out.println("sum of local variables " + (a+b));
        System.out.println("sum of instance variables "+(this.a+this.b));
    }
    void hello(){
        System.out.println("Hello batch 15");
    }
    void howAreYou(){
        System.out.println("How are you batch 15 ?");
    }
    void greeting(){
       this. hello(); //refers to the current instance methods
       this. howAreYou();
    }

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(10,20);
      obj.sum(100,200);

      //**********************************************

        obj.greeting();
    }
}
