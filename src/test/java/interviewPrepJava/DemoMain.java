package interviewPrepJava;

public class DemoMain extends DemoAbstraction {
	
	void m1()
	{
		System.out.println("This is abstract method");
	}
	
	
	public static void main(String[] args) 
	{
		DemoAbstraction ob = new DemoMain();
		ob.m2();
		ob.display();
		ob.m1();
	}

}
