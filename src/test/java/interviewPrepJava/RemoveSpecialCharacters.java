package interviewPrepJava;

public class RemoveSpecialCharacters {

	public static void main(String[] args) 
	{
		String s = "$%$#%#^ testing $%^%$$%$#@! selenium $%^&$%&$^&%^ j@#!va%@%";
		
		String txt = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("String after replacing all the special characters: "+txt);
	}

}
