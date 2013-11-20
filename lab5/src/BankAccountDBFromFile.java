import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class BankAccountDBFromFile {
		
	String n;
	
	@SuppressWarnings("finally")
	public String readData(){
	try {
		BufferedReader in  = new BufferedReader(new FileReader("bankAccountDetailsFile"));
		n = in.readLine();
		return n;
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		return "0";
	}
	
	}
	
	
	public void writeData(){
		int i = 0;
		this.readData();
		String amt;
		while(n.charAt(i)!=' '){
			i++;
		}
		amt = n.substring(0, i);
		
		String name = n.substring(i+1, n.length());
		BankAccount temp = new BankAccount(Long.valueOf(amt), name);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bankAccountFile"));
			out.writeObject(temp);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
