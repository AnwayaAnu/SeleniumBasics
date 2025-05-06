package interviewPrepJava;

public class LowerToUpperCase {

	public static void main(String[] args) 
	{
		String str = "anwayapkanu@gmail.com";
		char c[] = new char[4];
		String st = "";
		
		for(int i=0;i<-str.length();i++)
		{
			if((str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o') || (str.charAt(i)=='u'))
			{
				continue;
			}
			else
			{
				st = st+str.charAt(i);
			}
		}
		
		c = st.toCharArray();
		System.out.println(st);
	}

}
