package interviewPrepJava;

public class ReverseEachWordinaString {

	public static void main(String[] args) 
	{
		String str = "Welcome to Java";
		String reverse = "";
		
		String[] words = str.split(" ");
		
		/*for(String w:words)
		{
			String rev = "";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				rev = rev+w.charAt(i);
			}
			
			reverse = reverse + rev+" ";
		}*/
		
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverse = reverse+sb.toString()+" ";
		}
		System.out.println(str);
		System.out.println(reverse);
		
	}

}
