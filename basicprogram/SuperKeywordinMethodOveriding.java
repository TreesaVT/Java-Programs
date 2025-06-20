package basicprogram;

class AmazonLogin
{
	void login()
	{
		System.out.println("This is parent login");
	}
}

public class SuperKeywordinMethodOveriding extends AmazonLogin
{
	void login()
	{
		System.out.println("This is child login");
		super.login();
	}

	public static void main(String[] args) 
	{
		SuperKeywordinMethodOveriding s1=new SuperKeywordinMethodOveriding();
		s1.login();

	}

}
