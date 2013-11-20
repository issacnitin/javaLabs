public class BankAccount {

	private double balance;
	private long accountNumber = constants.initalAccountNumber;
	private long numberOfTransactions = 0;

	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	public BankAccount(double initalBalance, long accNo) {
		balance = initalBalance;
		accountNumber = accountNumber + accNo;
	}

	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
		numberOfTransactions++;
	}

	public void withdraw(double amount) {

		if (balance - amount > constants.minBalance || balance - amount == 0) {
			double newBalance = balance - amount;
			balance = newBalance;
			numberOfTransactions++;
		}

	}

	public void transfer(BankAccount a, double amt) {
		if (a.balance - amt > constants.minBalance) {
			this.deposit(amt);
			a.withdraw(amt);
			this.addTransaction();
			a.addTransaction();
		}

	}

	public void addTransaction() {
		numberOfTransactions = numberOfTransactions + 1;
	}

	public double getBalance() {
		return balance;
	}
}
