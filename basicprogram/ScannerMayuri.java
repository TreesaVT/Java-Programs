package basicprogram;
import java.util.Scanner;
public class ScannerMayuri {
	static void AreaOfCircle()
	{
		Scanner a = new Scanner(System.in);		
		System.out.println("Please enter the PiValue");
		double PiValue = a.nextDouble();
		System.out.println("Please enter the radius");
		Float r = a.nextFloat();	
		double Area_of_circle=PiValue*r*r;
		System.out.println("Please enter the Area of circle is   " + Area_of_circle);
		System.out.println(Area_of_circle);
		//a.close();	
	}
	static void CircumferenceOfCircle()
	{
		Scanner b = new Scanner(System.in);	
		//double c=b.nextDouble();
		System.out.println("Please enter the PiValue");
		double PiValue = b.nextDouble();
		System.out.println("Please enter the radius");
		Float r = b.nextFloat();		
		double Circumference_of_circle=2*PiValue*r;
		System.out.println("Please enter the Circumference of circle");
		System.out.println(Circumference_of_circle);
		b.close();
	}
	
	public static void main(String[] args) 
	{
		
        AreaOfCircle();
        CircumferenceOfCircle();
        
	}
}