package basicprogram;

public class MathClass {

	public static void main(String[] args) {
		System.out.println(Math.addExact(1,9));
		System.out.println(Math.addExact(1000087, 28888753));
		//Math.addExact(600000000000000000, 20000000000000)
		System.out.println(Math.subtractExact(10, 0));
		System.out.println(Math.subtractExact(20, 0));
		System.out.println(Math.multiplyExact(5, 2));
		System.out.println(Math.max(-10, 8));
		System.out.println(Math.min(-25, 0));
		System.out.println(Math.abs(-23));
		double pi=Math.PI;
		System.out.println(pi);
	}

}
