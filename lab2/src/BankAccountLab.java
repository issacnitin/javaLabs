public class BankAccountLab {

	private double balance;
	private long accNo;
	private int numberOfTransactions;

	BankAccountLab(double bal, long a) {
		balance = bal;
		accNo = constants.initalAccountNumber + a;
	}

	public void deposit(double amount) {
		double newAmt = amount + balance;
		balance = newAmt;

	}

	public void withdraw(double amount) {
		if (balance - amount > constants.minBalance || balance - amount == 0) {
			double newAmt = balance - amount;
			balance = newAmt;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void transfer(BankAccountLab a, double n) {

		if (balance - n > constants.minBalance || balance - n == 0) {
			this.withdraw(n);
			a.deposit(n);
			a.incrementTransaction();
			this.incrementTransaction();
		}
	}

	public void incrementTransaction() {
		numberOfTransactions = numberOfTransactions + 1;
	}
}
