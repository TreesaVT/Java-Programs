package practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String reverse="";
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a Strng");
	    String a1=s1.nextLine();
	    s1.close();
	    for (int i=a1.length()-1;i>=0;i--)
	    {
	    	char a=a1.charAt(i);
	    	reverse=reverse+a;
	    }
	    System.out.println(reverse);

	}

}
