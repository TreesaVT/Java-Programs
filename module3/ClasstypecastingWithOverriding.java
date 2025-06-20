package module3;

class Overriding11
{
	void login() {
		System.out.println("Parent");
	}
	
	static void password()
	{
		System.out.println("password");
	}
}

public class ClasstypecastingWithOverriding extends Overriding11
{
	
	void login() {
		System.out.println("Child");
	}
	
	void username()
	{
		System.out.println("User");
	}

	public static void main(String[] args) {
		System.out.println("Upcasting");
		Overriding11 o1=new ClasstypecastingWithOverriding();
		o1.login();//child is executing here because of overriding
		password();
		
		System.out.println("Downcasting");
		ClasstypecastingWithOverriding c1=(ClasstypecastingWithOverriding) o1;
		c1.login();
		password();
		c1.username();
		

	}

}
