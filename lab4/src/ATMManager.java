public class ATMManager {
	static BankAccount[] bAArray = new BankAccount[1000];
	Verifier myVerifier = new Verifier("abcd");

	public static void main(String passw, double accNo) {
		int i = 0;

		for (i = 0; i < 1000; i++) {
			if (bAArray[i].accountNumber == accNo)
				break;
		}

		if (i == 1000) {
			System.out.println("Not Found");
			return;
		}
		
		do{
		if(bAArray[i].myVerifier.password == passw){
			System.out.println("Verification Successful");
			bAArray[i].myVerifier.wrongTries = 0;
		}else
			bAArray[i].myVerifier.wrongTries++;
		}while(bAArray[i].myVerifier.wrongTries < 3);
		 
		if(bAArray[i].myVerifier.wrongTries == 3)
			bAArray[i].myVerifier.accountLock();

	}
}
