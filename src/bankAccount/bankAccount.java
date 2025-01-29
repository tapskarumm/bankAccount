package bankAccount;

public class bankAccount {
		
		// ecapsulation 
		private String owner; // Private access for encapsulation
		private double balance; // Private attribute for encapsulation
		
		// Constructor to initialize owner and balance
		public bankAccount(String owner, double initialBalance) {
		this.owner = owner;
		if (initialBalance > 0) {
		this.balance = initialBalance;
		} else {
		this.balance = 0;
		}
		}
		
		// Getter method for balance
		public double getBalance() {
		return balance;
		}
	
		// Method to deposit money into the account
		public void deposit(double amount) {
		if (amount > 0) {
		balance += amount;
		System.out.println("Deposited " + amount + " into account.");
		} else {
		System.out.println("Deposit amount must be positive.");
		}
		}
		
		// Method to withdraw money from the account
		public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
		balance -= amount;
		System.out.println("Withdrew " + amount + " from account.");
		} else {
		System.out.println("Insufficient funds or invalid amount.");
		}
		}
		// Main method to test the BankAccount class
		public static void main(String[] args) 
		{
		// Create a new BankAccount object
		bankAccount account = new bankAccount("Alice", 500);
		
		// Display initial balance
		System.out.println("Initial Balance: " + account.getBalance());
		
		// Deposit money and display balance
		account.deposit(200);
		
		System.out.println("Balance after deposit: " + account.getBalance());
		// Withdraw money and display balance
		account.withdraw(100);
		System.out.println("Balance after withdrawal: " + account.getBalance());
		
		// Attempt to withdraw more than the balance
		account.withdraw(700);
		System.out.println("Balance after attempting large withdrawal: " +
		account.getBalance());
		}
		

		//Method to transfer money to another account
		
		public void transfer(bankAccount otherAccount, double amount) {
		 if (amount > 0 && amount <= this.balance) {
			 
			// Withdraw from the current account
		     this.withdraw(amount); 
		     
		     otherAccount.deposit(amount); // Deposit into the other account
		     addTransaction("Transferred " + amount + " to " + otherAccount);
		     System.out.println("Transferred " + amount + " to account " + otherAccount);
		 } else {
		     System.out.println("Transfer failed. Insufficient balance or invalid amount.");
		 }
		}
		
		private void addTransaction(String string) {
			
			
		}
		
		} 
		
		
			


