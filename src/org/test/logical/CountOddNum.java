package org.test.logical;

public class CountOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
