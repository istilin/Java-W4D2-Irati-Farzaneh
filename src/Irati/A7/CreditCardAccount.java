package Irati.A7;

public class CreditCardAccount extends BankAccount{
    @Override
    public void withdrawMoney(double amount){
        if ((super.accountBalance - amount) > -3500){
            super.accountBalance -= amount;
        } else {
            try {
                throw new BankAccountNegativeException("Sorry but you don't have enough money to withdraw. Try another amount.");
            } catch (BankAccountNegativeException e) {
                e.printStackTrace();
            }
        }
    }
}
