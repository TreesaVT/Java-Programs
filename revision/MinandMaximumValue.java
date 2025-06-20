package revision;

public class MinandMaximumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,40};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Min value of array is " +min);
		System.out.println("Max value of array is " +max);
			
	}

}