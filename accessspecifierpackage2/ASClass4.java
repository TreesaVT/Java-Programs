package accessspecifierpackage2;

import accessspecifierpackage.ASClass1;

public class ASClass4 
{

	public static void main(String[] args) 
	{
		ASClass1.add1();
		//ASClass1.sub1();--->cannot access as it is private,will get CTE
		//ASClass1.div1();--->cannot access as it is not a subclass of ASClass1
		//ASClass1.mul1();--->cannot access as it is default,will get CTE
		

	}

}