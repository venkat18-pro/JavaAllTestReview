package test.inheritance;

public class Hierarchal3 extends Hierarchal1{

	public void c() {
		System.out.println("Hierarchal3 c method..");
	}
	
	public static void main(String[] args) {
		Hierarchal3 h3 = new Hierarchal3();
		h3.a();
		h3.c();
	}

}
