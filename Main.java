public class Main {
    public static void main(String[] args) {
        System.out.println("======= Java OOP Exercises Started =======");
        
        System.out.println("");
        System.out.println("=============== Exercise 0 ===============");
        // Exercise 0: Using the Example Person Class

        // Initialization a new Person object
        Person person = new Person("Simon", 24);
        
        // Example that prints "Hello, my name is [name]."
        System.out.println("Hello, my name is " + person.getName() + ".");
        
        // Complete the code to print "I'm [age] years old."
        System.out.println("I am " + person.getAge() + " years old.");
        
        
        System.out.println("");
        System.out.println("=============== Exercise 1 ===============");
        // Exercise 1: Creating a Bank Account
        // Create a BankAccount instance
        BankAccount account = new BankAccount("A100", 500.0);

        // Perform deposit and withdrawal operations.
        account.deposit(100.0);
        account.withdraw(50.0);
        System.out.println(account.balance);
        
        
        System.out.println("");
        System.out.println("=============== Exercise 2 ===============");
        // Exercise 2: Creating a Savings Account
        // Create a SavingsAccount instance
        // Perform deposit operations with interest
        SavingsAccount savings = new SavingsAccount("S200", 500.0, 0.05);
        savings.deposit(100.0);
        System.out.println(savings.balance);
        
        
        System.out.println("");
        System.out.println("=============== Exercise 3 ===============");
        // Exercise 3: Creating a Checking Account
        // Create a CheckingAccount instance
        // Perform withdrawal operations with overdraft
        CheckingAccount checking = new CheckingAccount("C300", 500.0, 200.0);
        checking.withdraw(600.0);
        System.out.println(checking.balance);
        
        
        System.out.println("");
        System.out.println("=============== Exercise 4 ===============");
        // Exercise 4: Managing Customer's Accounts
        // Create a BankCustomer instance
        // Add multiple accounts and display total balance
        BankCustomer customer = new BankCustomer("Simon");
        customer.addAccount(account);
        customer.addAccount(savings);
        customer.addAccount(checking);
        System.out.println(customer.totalBalance());
        
        
        System.out.println("");
        System.out.println("=============== Exercise 5 ===============");
        // Exercise 5: Transaction History
        // Add transactions to accounts and retrieve history
        account.getTransactionHistory();
        savings.getTransactionHistory();
        checking.getTransactionHistory();
        
        
        System.out.println("");
        System.out.println("=============== Exercise 6 ===============");
        // Exercise 6: Generate Banking Report
        // Generate and display a customer's banking report
        customer.generateReport();
        
        
        System.out.println("");
        System.out.println("=============== Exercise 7 ===============");
        // Exercise 7: Update Interest Rates
        // Update the interest rate and observe calculations
        savings.updateInterestRate(0.10);
        savings.deposit(100.0);
        System.out.println(savings.balance);
        
        
        System.out.println("");
        System.out.println("=============== Exercise 8 ===============");
        // Exercise 8: Override Withdrawal Method
        // Demonstrate overridden withdrawal method
        System.out.println(checking.balance);
        checking.withdraw(200.0);
        System.out.println(checking.balance);
        
        
        System.out.println("");
        System.out.println("====== Java OOP Exercises Completed ======");
        // Make sure all exercises are completed and print results
    }
}
