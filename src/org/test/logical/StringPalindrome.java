package org.test.logical;

public class StringPalindrome {

	public static void main(String[] args) {
	
		String s = "amma", rev = "";
		
		for (int i = s.length() -1 ; i >=0; i--) {
			
			rev = rev + s.charAt(i);
			
		}

		if(rev.equals(s)) 
			System.out.println("String is Palindrome.");
		else
			System.out.println("String is not Palindrome.");
	}

}
