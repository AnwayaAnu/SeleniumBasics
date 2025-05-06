package interviewPrepJava;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int ar[] = {3,2,5,7,8,1};
		int ecount=0;
		int ocount=0;
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println("Even nos: "+ar[i]);
				ecount++;
				continue;
			}
			else
			{
				System.out.println("Odd nos: "+ar[i]);
				ocount++;
			}
		}
		
		System.out.println("Total Even nos: "+ecount);
		System.out.println("Total Odd nos: "+ocount);
	}

}
