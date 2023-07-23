package interviewPrepJava;

import java.util.Scanner;

public class CheckStringIsPalindrom {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String txt = s.nextLine();
		int l = txt.length();
		
		String rev = "";
		
		for(int i=l-1;i>=0;i--)
		{
			rev = rev + txt.charAt(i);
		}
		
		System.out.println(rev);
	}

}
