package basicprogram;
import java.util.Arrays;
public class StringAreAnagram {
	public static void main(String[] args) {
		String a1="Listen";
		String a2="Silent";
		
		a1=a1.toLowerCase();
		a2=a2.toLowerCase();
		
		if (a1.length()!=a2.length())
		{
			System.out.println("Strings are not anagram");
		}
		else 
		{
			char[] c1=a1.toCharArray();//[l,i,s,t,e,n]
			char[] c2=a2.toCharArray();//[s,i,l,e,n,t]
			System.out.println(c1);//to check how its displayed
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(c1);//to check how its displayed
		
			boolean b=Arrays.equals(c1, c2);
		    if(b==true)
		    {
			    System.out.println("Strings are Anagram");
		    }
		    else
		    {
			    System.out.println("Strings are not Anagram");
		    }
		}
	}
}

	
