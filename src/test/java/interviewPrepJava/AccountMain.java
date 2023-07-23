package interviewPrepJava;

public class AccountMain {

	public static void main(String[] args)
	{
		Account_Encpsulation ae = new Account_Encpsulation();
		
		ae.setAccno(293293);
		ae.setName("Arya");
		ae.setBalnc(189900);
		
		System.out.println(ae.getAccno());
		System.out.println(ae.getBalnc());

		System.out.println(ae.getName());

		
		
	}

}
