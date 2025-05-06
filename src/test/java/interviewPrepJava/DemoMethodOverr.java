package interviewPrepJava;

class Car
{
	static void run()
	{
		System.out.println("Thisis car");
	}
}

class Vehicle extends Car
{
	static void run()
	{
		System.out.println("The car is a vehicle");
	}
}

public class DemoMethodOverr 
{

	public static void main(String[] args) 
	{
		Vehicle obj = new Vehicle();
		obj.run();
		
	}

}
