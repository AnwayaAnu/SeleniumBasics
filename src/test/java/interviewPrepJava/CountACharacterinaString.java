package interviewPrepJava;

public class CountACharacterinaString {

	public static void main(String[] args) 
	{
		String str ="Java is a programming language";
		
	
		int lb = str.length();
		
		int ls = str.replaceAll("a", "").length();
		
		System.out.println("the total no of a's is: "+(lb-ls));
	}

}
