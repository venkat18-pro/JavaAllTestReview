package org.test.logical;

public class NumberSwapping {

	public static void main(String[] args) {
		
		//with 3rd variable
		int a = 10,b = 20, c =0;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);

		//without 3rd variable
		int d=-10,e=-20;
		
		d = d + e;
		e = d - e;
		d = d - e;
		
		System.out.println("D: "+d);
		System.out.println("E: "+e);
		
	}

}
