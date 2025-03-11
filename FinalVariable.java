package basicprogram;

public class FinalVariable {
	
	final static double pi=3.14;//global static final variable
	final int r=10;//global non static final variable
	

	public static void main(String[] args) 
	{
		//double pi=5;//will take as local
		// r=2;//try to update and give the compile error
		FinalVariable f1=new FinalVariable();
		double area=pi*f1.r*f1.r;
	    System.out.println(area);
	    final int a=20;//local final variable
	    System.out.println(a);

	}

}

