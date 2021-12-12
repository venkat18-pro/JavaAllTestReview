package org.test.logical;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 121;
		int temp = num;
		int re = 0;
		int rev = 0;
		
		while(num>0) {
			
			re = num%10;
			rev = rev*10+re;
			num = num / 10;
			
		}
		
		if(temp == rev) {
		System.out.println("Palindrome..");
		}else {
			System.out.println("Not Palindrome..");
		}
	}

}
