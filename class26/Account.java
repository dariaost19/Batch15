package class26;

public class Account {
   private  double balance;
  private  String accountNumber;
   private String type;
   private String accountTitle;
   public void setAccountNumber(String accountNumber){
       if(accountNumber.length()!=16){
           System.out.println("wrong account");
       }else{
           this.accountNumber=accountNumber;
       }

   }
   public void setBalance(double balance){
       if(balance<0){
           System.out.println("Negative balance is not allowed");
       }else{
           this.balance=this.balance+balance;
       }
   }

    public double getBalance() {
        return balance;
    }

    public String getAccountTitle(){
       return accountTitle;
   }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }

}
class AccountTester{


    public static void main(String[] args) {
        Account a=new Account(-1000,"125448855fgsf","cheching","Prime");
        System.out.println(a.getAccountTitle());
       a.setBalance(-1245786);

    }
}
