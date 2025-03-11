package basicprogram;

public class GlobalVariable {
	int a=50;//global
	
	static void add(int b ,int c)
	{
		GlobalVariable g1=new GlobalVariable();
		int d =g1.a+c;//utilizing global variable
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		GlobalVariable g1=new GlobalVariable();
		System.out.println(g1.a);//calling GV
	    add(1,2);//calling static method
	

	}

}
