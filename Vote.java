package basicprogram;

public class Vote 
{
    public static void main(String[] args) 
    {
		int age=20;
		char gender='F';
		if((gender=='F') && (age>18))
		{
					System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}
