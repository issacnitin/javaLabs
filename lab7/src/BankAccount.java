import java.io.Serializable;

public class BankAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3755826333098413339L;
	public double balance = 0;
	public double accountNumber;
	Verifier myVerifier = new Verifier("passd");
	public String name = null;

	BankAccount(double amt, String n){
		balance = amt;
		accountNumber = Globals.initialAccountNo + Globals.a;
		name = n;
		Globals.a++;
	}
	
	BankAccount(double amt){
		balance = amt;
		accountNumber = Globals.initialAccountNo + Globals.a;

		Globals.a++;
	}
	
	public void withdraw(double amt) {
		balance = balance - amt;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public  double getBalance(){return balance;}
}
