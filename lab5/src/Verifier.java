import java.io.Serializable;


public class Verifier implements Serializable{
	public String password;
	public int wrongTries;
	
	public void accountLock(){
		System.out.println("Account is Locked");
	}
	
	Verifier(String a){
		password = a;
		wrongTries = 0;
	}
}
