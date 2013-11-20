
public class BankAccountTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BankAccount harrysChecking = new BankAccount(2000);
			harrysChecking.withdraw(500);
			System.out.println(harrysChecking.getBalance());
			
			BankAccountLab a,b;
			a = new BankAccountLab(2000 , 1);
			b = new BankAccountLab(1000, 2);
			a.transfer(b, 500);
			System.out.println(a.getBalance());
			System.out.println(b.getBalance());
			
	}

}
