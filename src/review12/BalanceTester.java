package review12;

public class BalanceTester {
    public static void main(String[] args) {
        transferBalance(10,15);

    }
   static void transferBalance(double accBalance,double amountToTranfer){
        if(amountToTranfer>accBalance){
            throw new LowBalanceException("You do not have enough balance");
        }

    }
}
