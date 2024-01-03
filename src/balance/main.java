package balance;
import java.util.Scanner; 
class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Two-argument constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit the amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class main {
	 public static void main(String[] args) {
	        Scanner Scanner = new Scanner(System.in);

	        // Create an account with no initial balance
	        Account account1 = new Account();

	        // Create an account with an initial balance of 1000
	        Account account2 = new Account(1000.0);

	        // Deposit and withdraw operations
	        account1.deposit(500.0);
	        account2.withdraw(200.0);

	        // Display balances
	        account1.displayBalance();
	        account2.displayBalance();
	    }
	}
