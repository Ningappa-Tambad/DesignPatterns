package AdapterDesignPattern2;

public class IciciBankAPI {

    public void transferMoney(String accountNumber, double amount) {
        System.out.println("Transferring " + amount + " to account number " + accountNumber + " using ICICI Bank API.");
    }

    public void checkBalance(String accountNumber) {
        System.out.println("Checking balance for account number " + accountNumber + " using ICICI Bank API.");
    }
}
