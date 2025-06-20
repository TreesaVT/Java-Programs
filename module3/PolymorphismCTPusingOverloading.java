package module3;

public class PolymorphismCTPusingOverloading {
	static void login(long mobileno)
	{
		System.out.println("Please enter the mobile no");
	}
	static void login(String emailid)
	{
		System.out.println("Please enter the emailid");
	}

	public static void main(String[] args) {
		login(9876543212l);
		//login("trtr.gmail.com");

	}

}
