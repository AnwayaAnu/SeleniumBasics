package interviewPrepJava;

class DemoOverriding 
{
	
	int x=10;
	void display()
	
	
	{

		System.out.println(x);
	}
	
}

class Demo1 extends DemoOverriding
{
	
	int x=20;
	void display()
	{
		super.display();
		System.out.println(x);
	}
}
