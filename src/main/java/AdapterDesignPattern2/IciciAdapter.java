package AdapterDesignPattern2;

public class IciciAdapter implements BankAPI {
    @Override
    public double getBalance(String accountNumber) {
        System.out.println("Getting balance for account number:: " + accountNumber + " using ICICI Bank API");
        return 0.0;
    }

    @Override
    public boolean sendMoney(String fromaccount, String toaccount, double amount) {
        System.out.println("Sending amount:: "+ amount + " from " + fromaccount + " to " + toaccount + " using ICICI Bank API");
        return false;
    }
}
