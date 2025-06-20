package revision;

import java.util.Scanner;

public class SwitchCaseVowel {

	public static void main(String[] args) 
	{
		//using switch case find is vowel or not/
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().toLowerCase().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch+" is a Vowel.");
				break;
		    default:
		    	System.out.println(ch+" is a consonant");
		}
		s.close();

	}

}