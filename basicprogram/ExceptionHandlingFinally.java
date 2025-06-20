package basicprogram;

public class ExceptionHandlingFinally {

	public static void main(String[] args) {
		try
		{
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled");
		}
		finally    //finally keyword is used in EH to anyway display or execute whether try or catch executed
		{
			System.out.println("Anyway Handled");
		}

	}

}
