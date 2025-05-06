package collectionsJavaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList <Integer>ar = new ArrayList<Integer>();
		
		ar.add(45);
		ar.add(67);
		ar.add(87);
		ar.add(22);
		ar.add(11);
		
		System.out.println(ar);
		Collections.sort(ar);
		
		System.out.println(ar);
		
		Object arr[] = ar.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		//sorting in reverse order
		
		Collections.sort(ar,Collections.reverseOrder());
		
		System.out.println(ar);
		
		
		//converting array into arraylist
		
		Object ar1[] = {43,77,10,2,9};
		
		ArrayList al = new ArrayList(Arrays.asList(ar1));
		
		System.out.println(al);
		
		
	}
	

}
