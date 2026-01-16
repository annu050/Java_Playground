package Basics.Access_Modifiers;

//Members marked private are accessible only within the same class
//They cannot be accessed directly from outside the class
//Private methods cannot be overridden because they are NOT visible to subclasses.
class BankAccount {

    // private data members
    private double balance;

    // constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // private method
    private void logTransaction(double amount) {
        System.out.println("Transaction of " + amount + " logged.");
    }

    // public method to access private data
    public void deposit(double amount) {
        balance += amount;
        logTransaction(amount);
    }

    // public method to read private data
    public double getBalance() {
        return balance;
    }
}

public class Private_Modifier {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // account.balance = 5000; ❌ Not allowed (private)
        // account.logTransaction(200); ❌ Not allowed (private)

        account.deposit(500);       // ✅ allowed
        System.out.println(account.getBalance()); // ✅ allowed
    }
}

