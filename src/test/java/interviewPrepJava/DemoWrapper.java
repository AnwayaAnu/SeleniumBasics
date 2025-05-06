package interviewPrepJava;

public class DemoWrapper {

	public static void main(String[] args) 
	{
		
		// for every primitive data type, there is corresponding Wrapper class available
		// Converting primitive to Object --> Auto boxing
		// Converting Object to primitive --> Un-boxing
		
		int z = 10;
		
		Integer oz = z;
		
		System.out.println(oz);		
		
		Integer x =10;
		
		int y = x;
		
		System.out.println(y);
		
		
		// Converting String into int, double,  boolean, and Char (Un boxing)
		
		String st = "234";
		String s = "123";
		
		int ab = Integer.parseInt(st);
		int bc = Integer.parseInt(s);
		
		System.out.println(st+s); //Concatenation
		System.out.println(ab+bc); // Addition
		
		String t = String.valueOf(ab+bc);
		System.out.println(t.charAt(1));
		
	//	int l =9; 
		
		double dl = 8.09;
		
		int l = (int) dl;
		
	//	boolean bool = true;
		
	//	System.out.println(bool);
		
		
	}

}
