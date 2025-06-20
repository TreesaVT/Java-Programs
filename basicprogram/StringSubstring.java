package basicprogram;

public class StringSubstring {

	public static void main(String[] args) {
		String a="Today is a good day;";
		String g=a.replace('o', 't');
				//replace('o' 't');
		String b=a.substring(6);
		String c=a.substring(11,15);
		String d=a.substring(a.length()-3);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(d);
		

	}

}
 