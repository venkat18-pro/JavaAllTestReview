package test.inheritance;

public class Hierarchal2 extends Hierarchal1{

	public void b() {
		System.out.println("Hierarchal2 a method..");
	}
	
	public static void main(String[] args) {
		
		Hierarchal2 h2 = new Hierarchal2();
		h2.a();
		h2.b();
	}

}
