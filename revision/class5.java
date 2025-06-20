package revision;
import java.util.Arrays;
public class class5 
{
	public static void main(String[] args) {
		String a="below";
				String b="elbow";
				if(a.length()!=b.length())
				{
					System.out.println("string length is not same");
				}
				else
				{
					char []a1=a.toCharArray();
					char []b1=b.toCharArray();
					Arrays.sort(a1);
					Arrays.sort(b1);
					System.out.println(Arrays.toString(a1));
					System.out.println(Arrays.toString(b1));
					if(Arrays.equals(a1, b1))
					{
						System.out.println("they are anagram");
			
					}
					else
					{
						System.out.println("they are not anagram");
					}
				}
	}
	
}