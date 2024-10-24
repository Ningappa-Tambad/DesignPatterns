package Adapter;

public class YesBankAPIAdapter implements  BankApiAdapter{

    private YesBankAPI yesBankAPI;
    @Override
    public double checkBalance(User user) {
        long balance=yesBankAPI.getBalance(user.getUsername(),user.getPassword());
        return (double) balance;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        char result= (char) yesBankAPI.doTransaction(fromUser.getUsername(), toUser.getUsername(), fromUser.getPassword(), amount);
        if(result=='Y'){
            return 1;
        } else if (result=='N')
        {
         return 0;
        }
        else
        {
            return -1;
        }
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankAPI.changePin(user.getUsername(),user.getPassword(),currentPin,newPin);
    }
}
