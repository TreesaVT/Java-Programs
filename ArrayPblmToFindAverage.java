package basicprogram;

public class ArrayPblmToFindAverage {

	public static void main(String[] args) {
		double [] input=new double[4];
		input[0]=20;
		input[1]=10;
		input[2]=11;
		input[3]=30;
		double sum=0;
		double average;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
			
		}
		System.out.println(sum);
		average=sum/input.length;
		System.out.println(average);
	}

}
