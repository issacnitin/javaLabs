import java.io.Serializable;

@SuppressWarnings("rawtypes")
public class SavingsAccount extends BankAccount implements ITRules, Comparable, Serializable {
	SavingsAccount(double amt, String n) {
		super(amt, n);
		// TODO Auto-generated constructor stub
	}

	public double taxDeducted = 0;

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		if (this.getBalance() < ((SavingsAccount) arg0).getBalance())
			return -1;
		else if (this.getBalance() > ((SavingsAccount) arg0).getBalance())
			return 1;
		else
			return 0;
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
	

	@Override
	public double calculateTax(double amt) {
		// TODO Auto-generated method stub
		double rate = 0;
		if (amt > ITRules.amt4)
			rate = ITRules.rate4;
		else if (amt > ITRules.amt3)
			rate = ITRules.rate3;
		else if (amt > ITRules.amt2)
			rate = ITRules.rate2;
		else if (amt > ITRules.amt1)
			rate = ITRules.rate1;
		return rate * amt;
	}

	public void addInterest() {

		taxDeducted = calculateTax(balance * Globals.interestRate);
		balance = balance + balance * Globals.interestRate - taxDeducted;

	}

}
