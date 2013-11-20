@SuppressWarnings("rawtypes")
public class CheckingAccount extends BankAccount implements ITRules, Comparable {

	CheckingAccount(double amt) {
		super(amt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		if (this.getBalance() < ((SavingsAccount) arg0).getBalance())
			return -1;
		else if (this.getBalance() > ((CheckingAccount) arg0).getBalance())
			return 1;
		else
			return 0;
	}

	@Override
	public double getBalance() {
		return super.balance;
	}

	@Override
	public double calculateTax(double amt) {
		// TODO Auto-generated method stub
		double rate = 0;
		if (amt > ITRules.amt4)
			rate = ITRules.rate4;
		else if (amt > ITRules.amt3)
			rate = ITRules.amt3;
		else if (amt > ITRules.amt2)
			rate = ITRules.amt2;
		else if (amt > ITRules.amt1)
			rate = ITRules.amt1;

		return rate * amt;
	}

}
