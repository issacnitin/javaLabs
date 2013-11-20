import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 * Reads a data set from a file. The file must have the format numberOfValues
 * value1 value2 . . .
 */
public class DataSetReader {

	/**
	 * Reads a data set.
	 * 
	 * @param filename
	 *            the name of the file holding the data
	 * @return the data in the file
	 * @throws ClassNotFoundException
	 */
	ObjectInputStream in;
	ObjectOutputStream out;
	
	public BankAccount readBankAccount() {
		BankAccount a = null;
		try {
			in = new ObjectInputStream(new FileInputStream("bankAccountFile"));
			a = (BankAccount) in.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return a;
	}

	public void writeBankAccount(BankAccount b) {
		try {
			out = new ObjectOutputStream(new FileOutputStream("bankAccountFile"));
			out.writeObject(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public double[] readFile(String filename) throws IOException,
			BadDataException {
		FileReader reader = new FileReader(filename);
		try {
			Scanner in = new Scanner(reader);
			readData(in);
		} finally {
			reader.close();
		}
		return data;
	}

	/**
	 * Reads all data.
	 * 
	 * @param in
	 *            the scanner that scans the data
	 */
	private void readData(Scanner in) throws BadDataException {
		if (!in.hasNextInt())
			throw new BadDataException("Length expected");
		int numberOfValues = in.nextInt();
		data = new double[numberOfValues];

		for (int i = 0; i < numberOfValues; i++)
			readValue(in, i);

		if (in.hasNext())
			throw new BadDataException("End of file expected");
	}

	/**
	 * Reads one data value.
	 * 
	 * @param in
	 *            the scanner that scans the data
	 * @param i
	 *            the position of the value to read
	 */
	private void readValue(Scanner in, int i) throws BadDataException {
		if (!in.hasNextDouble())
			throw new BadDataException("Data value expected");
		data[i] = in.nextDouble();
	}

	private double[] data;
}
