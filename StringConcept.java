package basicprogram;

public class StringConcept //upper,lower,length,charAt,trim
{

	public static void main(String[] args) {
	String a="school is to study";
	String b="STUDENT";
	System.out.println(a.toUpperCase());
	System.out.println(b.toLowerCase());
	
	int a1=a.length();
	System.out.println(a1);
	
	System.out.println(b.charAt(3));
	System.out.println(b.charAt(5));
	
	String c="     school is    to study   ";
	System.out.println(c);
	System.out.println(c.trim());

	}

}
