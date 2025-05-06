package collectionDemoPractical;

import java.util.HashSet;
import java.util.Set;

/* in Hashset we can store heterogeneous data
 * Insertion order is not preserved(No indexing concept)
 * Duplicates are not allowed
 * Multiple nulls are also not allowed/ Only single null value is allowed
 * */


public class DemoHashset {

	public static void main(String[] args) 
	{
		HashSet myset = new HashSet();
		
		Set Myst  = new HashSet();
		
		HashSet<String> st = new HashSet();
		
		myset.add(100);
		myset.add("Anu");
		myset.add(25.6);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		myset.add("Ramya");
		myset.add(45.9);
		myset.add(true);
		
		System.out.println(myset);
		
		myset.add("Krithka");
		
		System.out.println("After adding one more object:  "+myset);
		
		myset.remove("Krithka");
		
		System.out.println("After removing one object:  "+myset);
		
		
	}

}
