package basicprogram;

import java.util.Arrays;

public class ArrayPblmTocheckIf2Arraysequal {

	public static void main(String[] args) {
	int [] rollno1=new int [3];
	rollno1[0]=12;
	rollno1[1]=20;
	rollno1[2]=6;
	int [] rollno2=new int [3];
	rollno2[0]=12;
	rollno2[1]=20;
	rollno2[2]=6;
	boolean b=Arrays.equals(rollno1, rollno2);
	System.out.println(b);

	}

}
