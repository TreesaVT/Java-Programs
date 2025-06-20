package basicprogram;

public class Mayuri {

	public static void main(String[] args) 
	{
		
    int EmpIDNumber[]=new int[4];
    EmpIDNumber[0]=11;
    EmpIDNumber[1]=12;
    EmpIDNumber[2]=13;
    EmpIDNumber[3]=14;
    EmpIDNumber[4]=15;
    try 
    {
    	for (int i=0;i<=3;i++) 
    	{
    		System.out.println(EmpIDNumber[i]);
    	}
    	
    }
    catch(ArrayIndexOutOfBoundsException a) 
    {
    	for (int i=0;i<=4;i++) 
    	{
    		System.out.println(EmpIDNumber[i]);
    	}
    	try 
        {
        	for (int i=0;i<=3;i++) 
        	{
        		System.out.println(EmpIDNumber[i]);
        	}
        	
        }
    	finally
        {
        	System.out.println("Check the Size of an array");
        }}}
    }
    
	}
	

}