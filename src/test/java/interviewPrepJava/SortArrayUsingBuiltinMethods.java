package interviewPrepJava;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayUsingBuiltinMethods {

	public static void main(String[] args)
	{
		int a[] = {80,30,90,10,20};
		int b[] = {40,20,60,10,70};
		Integer c[] = {20,70,10,50,30};
		System.out.println("SORTING THE ARRAY 'A' USING PARALLEL SORT METHOD. IT WILL SORT IN ASCENDING OREDR");
		System.out.println("Before sorting arrays a :" +Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("after parallel sorting array a :" +Arrays.toString(a));
		
		System.out.println("SORTING THE ARRAY 'B' USING NORMAL SORT METHOD. IT WILL SORT IN ASCENDING ORDER");
		System.out.println("Before sorting arrays b :" +Arrays.toString(b));
		Arrays.sort(b);;
		System.out.println("after normal sorting array b :" +Arrays.toString(b));
		
		System.out.println("SORTING THE ARRAY 'C' USING COLLECTION'S REVERSE ORDER METHOD");
		System.out.println("Before sorting arrays b :" +Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());;
		System.out.println("after normal sorting array b :" +Arrays.toString(c));
		
	}

}
