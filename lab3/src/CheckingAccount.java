public class CheckingAccount extends BankAccount {

	private int transactionCount = 0;

	public void deductFees() {
		super.numberOfTransactions = super.numberOfTransactions + 1;
		if (super.numberOfTransactions > constants.freeTransactions)
			super.balance = super.balance - 10;
		transactionCount = (int) super.numberOfTransactions;
	}
	
	public int transactionCount(){
		return transactionCount;
	}

	public CheckingAccount(double initialBalance, String name, String add) {
		super(initialBalance, name, add);
		// TODO Auto-generated constructor stub

	}

	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		// TODO Auto-generated constructor stub
	}

	

}
