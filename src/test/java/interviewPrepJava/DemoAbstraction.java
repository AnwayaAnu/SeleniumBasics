package interviewPrepJava;

abstract public class DemoAbstraction 
{
	int k =10;
	abstract void m1();
	
	void m2()
	{
		System.out.println("This is concrete method");
	}
	void display()
	{
		System.out.println(k);
	}	
}
