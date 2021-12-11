package test.polymorphism;

public class MethodOverriding1 {

	public void a() {
		System.out.println("a method from MethodOverriding2 class");
	}
	
	public static void main(String[] args) {
		MethodOverriding1 m1 = new MethodOverriding1();
		m1.a();
	}
}
