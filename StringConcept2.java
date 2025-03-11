package basicprogram;

public class StringConcept2//concat,contains
{

	public static void main(String[] args) {
		String input="Treesa";
		System.out.println(input.concat(" V Thomas"));
		
		String i3="good";
		String i1="Students";
		String i2="are";
		System.out.println(i1.concat(" ").concat(i2).concat(" ").concat(i3));
		
		String a=input.concat(" V Thomas");
		boolean b=a.contains("Thomas");
		boolean c=a.contains("Treesa");
		boolean d=a.contains("treesa");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
