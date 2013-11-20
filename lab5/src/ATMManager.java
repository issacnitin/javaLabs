import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ATMManager {
	static BankAccount[] bAArray = new BankAccount[1000];
	static DataSetReader reader = new DataSetReader();
	Verifier myVerifier = new Verifier("abcd");
	static BankAccount temp;
		

	public static void main(String passw, double accNo) {
		int i = 0;

		for (i = 0; i < 1000; i++) {
			temp = reader.readBankAccount();
			if (temp.accountNumber == accNo)
				break;
		}
		reader = null;
		reader = new DataSetReader();
		if (i == 1000) {
			System.out.println("Not Found");
			return;
		}

		do {
			temp = reader.readBankAccount();
			if (temp.myVerifier.password == passw) {
				System.out.println("Verification Successful");
				temp.myVerifier.wrongTries = 0;
			} else
				temp.myVerifier.wrongTries++;
		} while (temp.myVerifier.wrongTries < 3);

		if (temp.myVerifier.wrongTries == 3)
			temp.myVerifier.accountLock();

	}
}
