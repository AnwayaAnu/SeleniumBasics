package interviewPrepJava;

interface A
{
	int a =10;
	void dispplay();
	
}

public class DemoInterface implements A {
	
	public void dispplay()
	{
		System.out.println(a);
		
	}

	public static void main(String[] args) 
	{
		DemoInterface obj = new DemoInterface();
		obj.dispplay();
	}

}
