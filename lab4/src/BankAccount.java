public abstract class BankAccount {
	public double balance = 0;
	public double accountNumber;
	Verifier myVerifier = new Verifier("passd");

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

	public abstract double getBalance();
}
