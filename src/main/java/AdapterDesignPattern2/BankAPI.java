package AdapterDesignPattern2;

public interface BankAPI {

    double getBalance(String accountNumber);

    boolean sendMoney(String fromaccount, String toaccount, double amount);
}
