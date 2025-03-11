package basicprogram;

public class SIBProgram {
	SIBProgram()
	{
		System.out.println("Constructor");
	}
   static                //SIB block
	{
		System.out.println("SIB");
	
	}
	{                     //IIB block
		System.out.println("IIB");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main");
		new SIBProgram();

	}

}
