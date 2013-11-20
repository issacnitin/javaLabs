
public class BankAccount {
	public double balance;
	public long accountNumber;
	
	public long numberOfTransactions = 0;
	private String name, address;

	public BankAccount(double initialBalance) {
		balance = initialBalance;
		accountNumber = constants.initalAccountNumber + constants.n;
		constants.n++;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + address + " " + Double.toString(balance) + " " + Double.toString(accountNumber); 
	}



	public BankAccount(double initialBalance, String name, String add){
		balance = initialBalance;
		this.name = name;
		this.address = add;
		accountNumber = constants.initalAccountNumber + constants.n;
		constants.n++;
		
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
