package basicprogram;

class AmazonLogin1
{
	final void login1()
	{
		System.out.println("This is parent login");
	}
}

public class FinalMethodNottoMethodoveride extends AmazonLogin1
{
	
	void login()
	{
		System.out.println("This is child login");
		
	}

	public static void main(String[] args) 
	{
		FinalMethodNottoMethodoveride f1=new FinalMethodNottoMethodoveride();
		f1.login();
		f1.login1();
	}

}
