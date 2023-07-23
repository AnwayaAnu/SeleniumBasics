package interviewPrepJava;

public class ReverseString {

	public static void main(String[] args) 
	{
		String text = "Welcome";
		String dest = "";
		
		int l = text.length();
		
		for(int i=l-1;i>=0;i--)
		{
			dest = dest+text.charAt(i);
		}
		
		System.out.println(dest);
	}

}
