package revision;

public class class8 
{
public static void main(String[] args) {
	int no[]= {10,20,30,40,50,60};
	int sum=0;
	double average=0;
	for(int i=0;i<=no.length-1;i++)
	{
		sum=sum+no[i];
	}
	System.out.println("sum is:"+sum);
	average=sum/no.length;
	System.out.println("average is:"+average);
}
}