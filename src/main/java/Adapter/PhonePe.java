package Adapter;

public class PhonePe
{

private static BankApiAdapter bankApiAdapter=new YesBankAPIAdapter();


    public static void main(String[] args) {
        // TODO Auto-generated method stub

    bankApiAdapter.checkBalance(new User("Raj","1234"));
    }



         //amount deducted
    }

