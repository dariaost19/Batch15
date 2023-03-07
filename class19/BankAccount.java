package class19;

public class BankAccount { // parent class or super class
    long  accountNumber;
    double money;
    void deposit(){
        System.out.println("Deposit ");
    }

}
class Checking extends BankAccount{ //child class or Sub Class.
    double interest;
    void transfer(){
        System.out.println("transfer methods from Checking class");
    }
}
class Savings extends BankAccount{
    double profit;
    void takeProfit(){
        System.out.println("Profit method from Savings class");
    }
}
class SuperSavings extends Savings{
    void SuperSaving(){
        System.out.println("SuperSaving method from Super Saving class");
    }
}
