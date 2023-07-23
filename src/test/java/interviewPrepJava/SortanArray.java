package interviewPrepJava;

import java.util.Arrays;
import java.util.Scanner;

public class SortanArray {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int l = s.nextInt();
		
		int a[] = new int[l];
		
		System.out.println("Enter numbers into array");
		
		for(int i=0;i<l;i++)
		{
			a[i] = s.nextInt();
		}	
		
		System.out.println("Arrays before sorting: "+Arrays.toString(a));
		
		for(int i=0;i<l-1;i++)
		{
			for(int j=0; j<l-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Arrays after sorting: "+Arrays.toString(a));
	}

}
