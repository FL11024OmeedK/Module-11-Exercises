public class SavingsAccount extends BankAccount {
    //attributes
    double interestRate;

    //constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    //methods
    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate;
        balance += amount + interest;
    }
}