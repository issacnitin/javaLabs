import java.util.Calendar;
import java.util.Date;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(double initialBalance) {
		super(initialBalance);
		// TODO Auto-generated constructor stub
	}

	

	public SavingsAccount(double initialBalance, String name, String add,
			double d) {
		super(initialBalance, name, add);
		// TODO Auto-generated constructor stub
		if(d>1)
			System.out.println("Rate undefined");
		this.interestRate = d;
	}

	public Date lastUpdate = new Date();
	Calendar lastUpdate_ = Calendar.getInstance();
	Calendar cal = Calendar.getInstance();
	private double interestRate;

	public void addInterest() {
		Date today = new Date();
		cal.setTime(today);
		lastUpdate_.setTime(lastUpdate);
		super.balance = super.balance
				+ (lastUpdate_.get(Calendar.MONTH) - cal.get(Calendar.MONTH))
				* interestRate * super.balance;
		lastUpdate = today;
	}

}
