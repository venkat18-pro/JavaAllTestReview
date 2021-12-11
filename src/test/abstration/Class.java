package test.abstration;

public class Class extends AbstrationClass implements Interface1{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("A method");
	}

	public static void main(String[] args) {
		
		Class c = new Class();
		c.a();
		c.b();
		c.c();
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("c method oin interface..");
	}
	
}
