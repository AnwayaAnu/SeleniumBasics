package interviewPrepJava;

public class FactorialOfANumber {

	public static void main(String[] args) 
	{
		int n =5;
		long factorial = 1;
		
		for(int i=1;i<=n;i++)
		{
			factorial = factorial*i;
		}
		
		System.out.println(factorial);
	}

}
