package interviewPrepJava;

public class CountNumberofCharactersinString
{

	public static void main(String[] args)
	{
		String txt = "The best";
		int count =0;
		
		for(int i=0;i<txt.length();i++)
		{
			char c = txt.charAt(i);
			if(c!=' ')
			{
				count++;;
			}
			
			
		}
		
		System.out.println(count);
		
		
	}

}
