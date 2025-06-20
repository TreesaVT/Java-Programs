package basicprogram;

import java.util.Scanner;

public class StringIsPalindrome {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=s1.next();
        s1.close();
		//String input="Malayalam";
		String reverse="";
		for (int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			reverse=reverse+c;
		}
		System.out.println(reverse);
		boolean b=input.equalsIgnoreCase(reverse);
		if(b==true)
		{
		System.out.println("Entered String is a Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		

	}

}
