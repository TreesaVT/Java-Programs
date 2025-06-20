package basicprogram;

public class FinalExamquestion {
	
	final int x=10;
	
	void modify()
	{
		x=20;
		System.out.println(x);
	}

	public static void main(String[] args) {
		FinalExamquestion test=new FinalExamquestion();
		test.modify();
	}

}
