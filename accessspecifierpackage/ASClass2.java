package accessspecifierpackage;

public class ASClass2 {

	public static void main(String[] args) {
		ASClass1.add1();
		//ASClass1.sub1();--->cannot access as it is private,will get CTE
		ASClass1.div1();
		ASClass1.mul1();
		ASClass1 a1=new ASClass1();
		a1.div11();

	}

}
