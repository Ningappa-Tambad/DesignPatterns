package Adapter;

public class PhonePe
{
    private BankApiAdapter bankApiAdapter;

    public PhonePe(BankApiAdapter bankApiAdapter)
    {
        this.bankApiAdapter = bankApiAdapter;
    }

    public void checkBalance(User user)
    {
        double d=bankApiAdapter.checkBalance(user);
        System.out.println("Balance is= " +d);
    }

    public void transferMoney(User fromUser, User toUser, double amount)
    {
         if(bankApiAdapter.checkBalance(fromUser)<amount)
         {
             System.out.println("Less balance");
         }

         int status= bankApiAdapter.doTransaction(fromUser, toUser, amount);

         switch (status)
         {
             case 1:
                 System.out.println("transaction successful");
                 break;
                 case 2:
                     System.out.println("transaction failed");
                     break;
                     case 3:
                         System.out.println("In Progress");
         }

         //amount deducted
    }
}
