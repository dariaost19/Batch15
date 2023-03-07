package class23;

public class CreditCard1 {
    double balance;
    double interest;

    public CreditCard1(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest(){
        System.out.println("Interest "+(balance*interest)/100);
    }
}
class Visa extends CreditCard1{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard1{
    public AX(double balance, double interest) {
        super(balance, interest);

    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest on AX credit card "+(balance*interest)/100+30 +" extra fee");

    }

    public static void main(String[] args) {
        CreditCard1 cc=new CreditCard1(100,10);
        cc.calculateInterest();
        Visa v=new Visa(1000,15);
        v.calculateInterest();
        AX ax=new AX(120,11);
        ax.calculateInterest();
    }
}
