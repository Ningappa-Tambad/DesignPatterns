package AdapterDesignPattern2;

public class AxisBankAdapter implements BankAPI {
    @Override
    public double getBalance(String accountNumber) {
        System.out.println("Axis Bank Adapter: Getting balance for account number: " + accountNumber);
        return 0.0;
    }

    @Override
    public boolean sendMoney(String fromaccount, String toaccount, double amount) {
        System.out.println("Axis Bank Adapter: Sending money from " + fromaccount + " to " + toaccount + " amount: " + amount);
        return false;
    }
}
