package test.polymorphism;

public class methodoverload1 {

	public void a() {
		System.out.println("a");
	}
	
	public void a(String s) {
		System.out.println("a: "+s);
	}
	
	public void a(String s, int i) {
		System.out.println("a: "+s+"int: "+i);
	}
	
	public static void main(String[] args) {
		methodoverload1 m = new methodoverload1();
		m.a();
		m.a("Hello");
		m.a("hello",49);
	}
}
