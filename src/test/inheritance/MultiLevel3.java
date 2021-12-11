package test.inheritance;

public class MultiLevel3 extends MultiLevel2 {

	public void c() {
		System.out.println("MultiLevel3 c method..");
	}
	
	public static void main(String[] args) {
		MultiLevel3 m3 = new MultiLevel3();
		m3.a();
		m3.b();
		m3.c();
	}

}
