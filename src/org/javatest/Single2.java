package org.javatest;

public class Single2 extends Single1 {

	private void b() {
		System.out.println("Single 2 B method..");
	}
	
	public static void main(String[] args) {
	
		Single2 si = new Single2();
		si.a();
		si.b();
		
	}

}
