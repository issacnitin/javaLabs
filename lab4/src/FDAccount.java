@SuppressWarnings("rawtypes")
public class FDAccount extends BankAccount implements ITRules, Comparable {

	FDAccount(double amt) {
		super(amt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		if (this.getBalance() < ((FDAccount) arg0).getBalance())
			return -1;
		else if (this.getBalance() > ((FDAccount) arg0).getBalance())
			return 1;
		else
			return 0;
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

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
