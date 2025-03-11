package basicprogram;
//import java.util.ex-->to check list of exceptions,Also can be checked in lang package
//Always good to declare exceptions which have been thrown
//only 1 exeptions also can be thrown,Here just added 2 using ifelse conditions.Directly we are not able to write 2 thow keywords
import java.util.InputMismatchException;

public class ExceptnThrowUsingIfElse {

	public static void main(String[] args) throws NullPointerException,InputMismatchException//clearing or declaring exception
	{
		if(1>3)
		{
			throw new NullPointerException("Exception regarding nullpoint");//thowing exception
		}
		else
		{
			throw new InputMismatchException();
		}

	}

}