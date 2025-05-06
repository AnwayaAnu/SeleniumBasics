package interviewPrepJava;

class ATP 
{
	final int x =10;
	
	void show()
	{
		System.out.println(x);
	}
	
	ATP()
	{
		System.out.println("This is a parent constructor");
	}
	
	void Show(int x)
	{
		System.out.println(x);
	}
}

class BTP extends ATP
{
	int x=100;
	
	void show(int x)
	{
		System.out.println(x);
	}
	
	BTP()
	{
		System.out.println("This is a child constructor");
	}

}
