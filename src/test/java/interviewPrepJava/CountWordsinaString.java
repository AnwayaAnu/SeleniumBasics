package interviewPrepJava;

import java.util.Scanner;

public class CountWordsinaString {

	public static void main(String[] args) 
	{
		int count=1;
		System.out.println("Enter a string: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		for(int i=0; i<str.length()-1;i++)
		{
			if( (str.charAt(i)==' ') && (str.charAt(i+1)!=' ') )
			{
				 count++;
			}
		}
		
		System.out.println("The no of words in the entered string is: "+count);
	}

}
