package collectionDemoPractical;

import java.util.HashMap;
import java.util.Set;

/* In hashmap the date will be stored as key and value pairs
 * Insertion order is not preserved(Since there is no indexing concept)
 * Key cannot be duplicated but the values can be duplicated
 * */

public class DemoHashMap {

	public static void main(String[] args)
	{
		HashMap<Integer, String> mymap = new HashMap<Integer, String>();
		
		mymap.put(100, "Anu");
		mymap.put(102, "Ram");
		mymap.put(101, "Ramya");
		mymap.put(103, "James");
		mymap.put(101, "Minu");
		mymap.put(104,"Anu");
		
		System.out.println(mymap.size());
		
		mymap.remove(101);
		System.out.println("After removing: "+mymap);
		
		System.out.println(mymap.keySet());
		
		
		
		for(int x:mymap.keySet())
		{
			System.out.println(x+"   "+mymap.get(x));
		}
		
	}
	

}
