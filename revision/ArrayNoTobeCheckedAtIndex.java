package revision;

public class ArrayNoTobeCheckedAtIndex {
//	static int notobechecked=24;
	public static void main(String[] args) {
		int no[]=new int[5];
		no[0]=21;
		no[1]=23;
		no[2]=98;
		no[3]=76;
		no[4]=765;
		
		int notobechecked=23;
		for(int i=0;i<=no.length-1;i++)
		{
		/*	if(no[i]==notobechecked)
			{
				System.out.println("This number is present at index "+i);
				break;
			}*/
			if(notobechecked==no[i])
			{
				System.out.println("This number is present at index "+i);
				
			}
			else if(no.length==i+1)
			{
				System.out.println("Sorry we are not able to find the number");
							
			}
		/*	if(notobechecked!=no[i])
			{
				System.out.println("Sorry we are not able to find the number");
				
			}*/
		}
		

	}

}