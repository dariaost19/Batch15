package class19;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        account1.accountNumber=7844884131545l;
        account1.money=1000;
        account1.deposit();
        System.out.println(account1.accountNumber);
        System.out.println(account1.money);
       // account1.trasfer(); method defined inside the child class not available to the parent class.

        System.out.println("*********************************************");

        Checking account2=new Checking();
        account2.accountNumber=547842434343l;
        account2.money=4580;
        account2.interest=0;
        account2.deposit(); //comes from parent
        account2.transfer(); //comes from child
        System.out.println("******************************");

Savings account3=new Savings();
account3.accountNumber=54587984615896l;
account3.money=4578;
account3.profit=100;
account3.takeProfit();
account3.deposit();
        System.out.println("********************************");
SuperSavings account4=new SuperSavings();
account4.accountNumber=45587131659663l;
account4.money=5400;
account4.profit=150;
account4.deposit();
account4.SuperSaving();
account4.takeProfit();

//account3.interest  // we can inherit only features from Parent class.
    }
}
