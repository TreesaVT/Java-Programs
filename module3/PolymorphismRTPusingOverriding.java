package module3;

class Overriding
{
	void login()
	{
		System.out.println("Please enter the mobile no");
	}
}

public class PolymorphismRTPusingOverriding extends Overriding {
	void login()
	{
		System.out.println("Please enter the emailid");
	}

	public static void main(String[] args) {
		//PolymorphismRTPusingOverriding p1=new PolymorphismRTPusingOverriding();//child object
		//p1.login();
		Overriding o1= new Overriding();//parent object
		o1.login();

	}

}
