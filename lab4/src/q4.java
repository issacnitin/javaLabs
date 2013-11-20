
public class q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "657";
		Integer istrInteger = Integer.valueOf(str);
		System.out.println(istrInteger);
		
		int istrInt = (int)istrInteger;
		System.out.println(istrInt);
		System.out.println(Math.sqrt(istrInt));
		for(int i = 1; i < str.length(); i+=2)
			System.out.println(str.charAt(i) + ' ');
	}

}
