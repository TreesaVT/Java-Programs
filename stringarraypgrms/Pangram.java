package stringarraypgrms;

import java.util.Scanner;
public class Pangram {
	


	// check the given string is Pangram or not
	// The quick brown fox jumps over the lazy dog -- Pangram
	// The quick brown fox jumps over the dog -- Not Pangram

	    public static void checkPangram(String s) {
	        s = s.toLowerCase();
	        boolean flag = true;
	        if (s.length() < 26) {
	            System.out.println(s + " is Not a Pangram String.");
	        } else {
	            for (char ch = 'a'; ch <= 'z'; ch++) {
	                if (s.indexOf(ch) < 0) {
	                    flag = false;
	                }
	            }
	            if (flag == true) {
	                System.out.println(s + " is a Pangram String.");
	            } else {
	                System.out.println(s + " is Not a Pangram String.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String: ");
	        String s = sc.nextLine();
	        checkPangram(s);
	    }
	}



