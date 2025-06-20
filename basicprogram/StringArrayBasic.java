package basicprogram;
public class StringArrayBasic {
	public static void main(String[] args) //throws cannot be used as this is a unchecked or runtime exception
	{
		int rollno[]=new int[7];
		rollno[0]=6;
		rollno[1]=16;
		rollno[2]=46;
		rollno[3]=62;
		rollno[4]=64;
		rollno[5]=70;
		rollno[6]=75;
		
		try{
			rollno[7]=85;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			
		}
		String name[]=new String[3];
		name[0]="Treesa";
		name[1]="ram";
		name[2]="Manish";
		
		for (int i=0;i<7;i++) 
		{
			System.out.println(rollno[i]);
			try{
				//if(i>2);
				System.out.println(name[i]);
			}
			catch(ArrayIndexOutOfBoundsException a2)
			{
				System.out.println("No name");
			}
		}
	}
}
