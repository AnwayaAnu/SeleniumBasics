package interviewPrepJava;

public class SomOfElementsInAnArray {

	public static void main(String[] args) 
	{
		int a[] = {4,2,6,8,1};
		int s = 0;
		
		for(int i=0;i<a.length;i++)
		{
			s = s+a[i];
		}
		
		System.out.println(s);
	}

}
