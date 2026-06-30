public class BankAccount {
    //attributes
    String accountNumber;
    double balance;
    
    //constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //methods
    public void deposit(double amount) {
        balance += amount; 
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        }   
    }
}
