public class AccountTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount a1 = new SavingsAccount(50000);
		System.out.println(a1.balance);
		a1.deposit(100000);
		a1.addInterest();
		System.out.println(a1.getBalance());
		System.out.println(a1.taxDeducted);
		System.out.println(a1.balance);
		
		SavingsAccount a2 = new SavingsAccount(60000);
		System.out.println(a2.compareTo(a1));
		a2.deposit(330000);
		System.out.println(a2.compareTo(a1));
	}

}
