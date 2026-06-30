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
        recordTransaction("Deposited: " + amount + " with interest: " + interest);
    }

    @Override
    public String toString() {
        return "Savings Account - Account Number: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate;
    }

    public void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
}
