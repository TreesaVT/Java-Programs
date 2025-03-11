package basicprogram;

public class StringReverse {

	public static void main(String[] args) {
		String input="Mango";
		String reverse="";
		/*char c1=input.charAt(4);
		char c2=input.charAt(3);
		char c3=input.charAt(2);
		char c4=input.charAt(1);
		char c5=input.charAt(0);
		System.out.println(c1+""+c2+""+c3+""+c4+""+c5);*/
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			reverse=reverse+c;
			System.out.println(reverse);//not required just to show how it work

		}
	System.out.println(reverse);

	}

}
