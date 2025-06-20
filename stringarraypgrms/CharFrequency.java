package stringarraypgrms;
import java.util.Scanner;
public class CharFrequency {
	
	    public static void charFrequency(String str) {
	        str = str.toLowerCase();
	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            int count = 0;
	            for (int i = 0; i < str.length(); i++) {
	                if (str.charAt(i) == ch) {
	                    count++;
	                }
	            }
	            if (count > 0) {
	                System.out.println(ch + " : " + count);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String str = sc.nextLine();
	        charFrequency(str);
	    }
	}


