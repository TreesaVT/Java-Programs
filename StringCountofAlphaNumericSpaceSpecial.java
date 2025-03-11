package basicprogram;
public class StringCountofAlphaNumericSpaceSpecial {
	public static void main(String[] args) {
		int Count_of_Spaces=0;
		int Count_of_Numbers=0;
		int Count_of_Alphabet=0;
		//int Count_of_Spaces=0;
		String a="abc de@ 123%";
		char[] c=a.toCharArray();
		//System.out.println(c);//to check how its displayed
		//System.out.println(Arrays.toString(c));//not required
	  for(int i=0;i<a.length();i++)
		{
			boolean b1=Character.isAlphabetic(c[i]);
			boolean b2=Character.isDigit(c[i]);
			boolean b3=Character.isWhitespace(c[i]);
			
			if(b1==true)
			{
				Count_of_Alphabet++;
			}
			else if(b2==true)
			{
				Count_of_Numbers++;
			}
			else if(b3==true)
			{
				Count_of_Spaces++;
			}
		}
		int Count_of_Special_Characters=a.length()-(Count_of_Alphabet+Count_of_Numbers+Count_of_Spaces);
		System.out.println("Count_of_Alphabet "+Count_of_Alphabet);
		System.out.println("Count_of_Numbers "+Count_of_Numbers);
		System.out.println("Count_of_Spaces "+Count_of_Spaces);
		System.out.println("Count_of_Special_Characters "+Count_of_Special_Characters);
	}
}
