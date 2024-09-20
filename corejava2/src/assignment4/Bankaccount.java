package assignment4;

public class Bankaccount {
	 private int accountNumber;
	    private double balance;

	   
	    

	    // Method to deposit an amount to the account
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Deposit amount must be positive.");
	        }
	        balance += amount;
	    }

	    public void BankAccount(int accountNumber, double balance) {

			this.accountNumber = accountNumber;
			this.balance = balance;
		}

		// Method to withdraw an amount from the account
	    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Withdrawal amount must be positive.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds for the withdrawal.");
	        }
	        balance -= amount;
	    }

	    // Method to display the account balance
	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber + ", Balance: ₹" + balance);
	    }
	}


