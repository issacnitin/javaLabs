
public class BankAccountTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount a =  new SavingsAccount(5500, "nitin", "ah3", .25);
		CheckingAccount b = new CheckingAccount(5500, "nitin", "ah3");
		b.deductFees();
		a.addInterest();
		System.out.println(a.getBalance() + " " + a.toString());
		System.out.println(b.getBalance() + " " + b.toString());
		b.deductFees();
		b.deductFees();
		System.out.println(b.getBalance() + " "  + b.toString());
		
	}

}
