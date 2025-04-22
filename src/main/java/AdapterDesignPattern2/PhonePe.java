package AdapterDesignPattern2;

public class PhonePe {

    public static void main(String[] args) {

 // BankAPI bankAPI = new IciciAdapter();

        BankAPI bankAPI = new AxisBankAdapter();

  bankAPI.sendMoney("123456", "23456", 200000);

  bankAPI.getBalance("123456");
    }
}
