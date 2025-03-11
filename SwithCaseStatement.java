package basicprogram;

import java.util.Scanner;

public class SwithCaseStatement {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Select Which browser has to be launched");
		System.out.println("Select 1 for Chrome,2 for edge,3 for firefox and 4 for safari");
		int Whichcase=s1.nextInt();
		switch(Whichcase)
		{
		case 1:System.out.println("Launch Chrome browser");
		break;//if not written,next case also executes
		case 2:System.out.println("Launch edge browser");
		break;
		case 3:System.out.println("Launch firefox browser");
		break;
		case 4:System.out.println("Launch safari browser");
		break;
		default:System.out.println("Entered case is wrong");
		}
	}
}


