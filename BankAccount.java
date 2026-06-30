import java.util.ArrayList;

public class BankAccount {
    //attributes
    String accountNumber;
    double balance;
    ArrayList<String> transactions;
    
    //constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<String>();
    }
 
    //methods
    public void deposit(double amount) {
        balance += amount;
        recordTransaction("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            recordTransaction("Withdrew: " + amount);
        }   
    }

    public void recordTransaction(String transaction) {
        transactions.add(transaction);
    }

    public void getTransactionHistory() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    @Override
    public String toString() {
        return "Bank Account - Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
