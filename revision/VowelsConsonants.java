package revision;

public class VowelsConsonants {

	public static void main(String[] args) {
		String a="Sandhya";
		String b=a.toLowerCase();
		int vowel=0;
		int consonant=0;
		for(int i=0;i<b.length();i++)
		{
			
			if(b.charAt(i)=='a'||b.charAt(i)=='e'|| b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u')
			{
				System.out.println("Vowel "+b.charAt(i)+" is present at index "+i);
				vowel++;
			}
			else
			{
				System.out.println("Consonant "+b.charAt(i)+" is present at index "+i);
				consonant++;
			}
		}
       System.out.println("The number of vowels are "+vowel);
       System.out.println("The number of consonants are "+consonant);
	}

}