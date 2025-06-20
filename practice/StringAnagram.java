package practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st Strng");
	    String a1=s1.nextLine();
	    System.out.println("Enter 2nd Strng");
	    String a2=s1.nextLine();
	    s1.close();
	    a1=a1.toLowerCase();
	    a2=a2.toLowerCase();
	    if(a1.length()!=a2.length())
	    {
	    	System.out.println("Not Anagram as the length diff");
	    }
	    else
	    {
	    	char[] c1=a1.toCharArray();
	    	char[] c2=a2.toCharArray();
	    	Arrays.sort(c1);
	    	Arrays.sort(c2);
	    	boolean b=Arrays.equals(c1, c2);
	    	if(b==true)
	    	{
	    		System.out.println("Anagram");
	    	}
	    	else
	    	{
	    		System.out.println("Not Anagram");
	    	}
	    }
	

	}

}
