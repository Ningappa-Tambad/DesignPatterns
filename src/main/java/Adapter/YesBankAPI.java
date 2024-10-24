package Adapter;

public class YesBankAPI
{
    public long getBalance(String username,String password)
    {
        return 1000;
    }

    public int doTransaction(String fromusername,String tousername,String frompassword,double amount)
    {
        return 'y';
    }

    public boolean changePin(String username,String password,int currentPin,int newPin)
    {
        return true;
    }
}
