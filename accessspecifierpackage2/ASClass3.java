package accessspecifierpackage2;

import accessspecifierpackage.ASClass1;

public class ASClass3 extends ASClass1
{

	public static void main(String[] args) 
	{
		ASClass1.add1();
		//ASClass1.sub1();--->cannot access as it is private,will get CTE
		ASClass1.div1();
		//ASClass1.mul1();--->cannot access as it is default,will get CTE
		ASClass3 a1=new ASClass3();
		a1.div11();

	}

}
