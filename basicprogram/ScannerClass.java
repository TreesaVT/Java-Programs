package basicprogram;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("give the inputs");
		int a=s1.nextInt();
		byte b=s1.nextByte();
		long c=s1.nextLong();
		short d=s1.nextShort();
		float e=s1.nextFloat();
		double f=s1.nextDouble();
		boolean g=s1.nextBoolean();
		String name=s1.next();
		double answer= a+b+c+d+e+f;
		System.out.println(answer);
		if(g)
		{
			System.out.println(name);
		}
		System.out.println(answer);
        s1.close();
        
	}

}
