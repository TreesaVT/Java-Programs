package practice;
import java.util.Scanner;
public class StrngIsALPABETnumericSpace {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a Strng");
	    String a1=s1.nextLine();
	    s1.close();
	    int alpha_count=0;
	    int numeric_count=0;
	    int space_count=0;
	    char[] c1=a1.toCharArray();
	    for(int i=0;i<a1.length();i++)
	    {
	    	boolean b1=Character.isAlphabetic(c1[i]);
	    	boolean b2=Character.isDigit(c1[i]);
	    	boolean b3=Character.isWhitespace(c1[i]);
	    	
	     	if(b1==true)
	    	{
	    		alpha_count++;
	    	}
	    	else if(b2==true)
	    	{
	    		numeric_count++;
	    	}
	    	else if(b3==true)
	    	{
	    		space_count++;
	    	}
	    }
	    int Sprcial_count=a1.length()-(alpha_count+numeric_count+space_count);
	    System.out.println("alpha_count "+alpha_count);
    	System.out.println("numeric_count "+numeric_count);
    	System.out.println("space_count "+space_count);
    	System.out.println("Sprcial_count "+Sprcial_count);

	}

}
