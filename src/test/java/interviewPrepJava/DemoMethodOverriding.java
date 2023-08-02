package interviewPrepJava;

class C
{
	void m1()
	{
		System.out.println(1000);
	}
}

class B extends C
{
	void m1()
	{
		System.out.println(2000);

	}
}
public class DemoMethodOverriding extends B
{
	
	void m1()
	{
		System.out.println(3000);

	}

	
	public static void main(String[] args) 
	{
		DemoMethodOverriding ob = new DemoMethodOverriding();
		ob.m1();
	}

}
