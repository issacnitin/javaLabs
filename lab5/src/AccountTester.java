import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AccountTester {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		BankAccount a = new BankAccount(1000, "nnn");

		DataSetReader reader = new DataSetReader();

		reader.writeBankAccount(a);
		BankAccount ab = null;
		ab = reader.readBankAccount();
		System.out.println(ab.name);
		System.out.println(ab.balance + "\n");
		BankAccountDBFromFile test = new BankAccountDBFromFile();
		test.writeData();
		a = reader.readBankAccount();
		System.out.println(a.name);
		System.out.println(a.accountNumber);
		System.out.println(a.balance + "\n");
		

	}

}
