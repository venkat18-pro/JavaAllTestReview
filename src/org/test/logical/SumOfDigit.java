package org.test.logical;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int num = 1234;
		int re = 0;
		int sum = 0;
		
		while(num>0) {
			re = num % 10;
			sum = sum + re;
			num = num/10;
		}

		System.out.println(sum);
	}

}
