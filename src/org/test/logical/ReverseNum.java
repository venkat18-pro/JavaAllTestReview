package org.test.logical;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
		int re = 0;
		int rev = 0;
		
		while (num > 0) {
			re = num % 10;
			rev = rev*10 + re;
			num = num/10;
		}
		
		System.out.println(rev);
	}

}
