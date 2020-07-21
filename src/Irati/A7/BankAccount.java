package Irati.A7;

public class BankAccount {
    protected String customerName;
    protected double accountBalance;

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void addMoney(double amount){
        this.accountBalance += amount;
    }

    public void withdrawMoney(double amount){
        if ((this.accountBalance - amount) > 0){
                this.accountBalance -= amount;
        } else {
            try {
                throw new BankAccountNegativeException("Sorry but you don't have enough money to withdraw. Try another amount.");
            } catch (BankAccountNegativeException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        /*BankAccount bank1 = new BankAccount();
        bank1.setAccountBalance(2000);
        bank1.setCustomerName("Minion");
        System.out.println(bank1.getAccountBalance());
        bank1.addMoney(1000);
        System.out.println(bank1.getAccountBalance());
        bank1.withdrawMoney(3000);
        System.out.println(bank1.getAccountBalance());*/

        /*DebitCardAccount bank2 = new DebitCardAccount();
        bank2.setAccountBalance(2000);
        bank2.setCustomerName("Minion2");
        bank2.addMoney(1000);
        System.out.println(bank2.getAccountBalance());
        bank2.withdrawMoney(4000);*/

        /*CreditCardAccount bank3 = new CreditCardAccount();
        bank3.setAccountBalance(2000);
        bank3.setCustomerName("Minion2");
        bank3.addMoney(1000);
        System.out.println(bank3.getAccountBalance());
        bank3.withdrawMoney(4000);
        System.out.println(bank3.getAccountBalance());
        bank3.withdrawMoney(4000);*/
        }
}
