package collectionDemoPractical;

import java.util.ArrayList;
import java.util.List;

/* In ArrayList we can store heterogeneous data
 * Insertion order is preserved(Indexing concept)
 * Duplicates are also allowed
 * Multiple nulls are allowed
 * */


public class DemoArrayList {

	public static void main(String[] args) 
	{
		List mylist =  new ArrayList();
		mylist.add("Anwayapk");
		mylist.add(28);
		mylist.add(10);
		mylist.add("Indeevaram");
		boolean flag = true;
		
		//System.out.println(mylist);
		
		for(Object x:mylist)
		{
			//System.out.println(x);
			
			if(x.equals("Anwaya"))
			{
				System.out.println("Element found");
				flag=false;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Element not found");
		}
		
		
		mylist.add(2, "Deepak");
		
		System.out.println(mylist.get(2));
		
		
		System.out.println(mylist);
	}

}
