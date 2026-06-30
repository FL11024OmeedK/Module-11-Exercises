import java.util.ArrayList;

public class BankCustomer {
    // attributes
    String name;
    ArrayList<BankAccount> accounts;

    // constructor
    public BankCustomer(String name) {
        this.name = name;
        this.accounts = new ArrayList<BankAccount>();
    }

    // methods
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public double totalBalance() {
        double total = 0;

        for (BankAccount account : accounts) {
            total += account.balance;
        }

        return total;
    }
}
