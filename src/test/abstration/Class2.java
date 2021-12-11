package test.abstration;

public class Class2 {

	public static void main(String[] args) {
		Interface1 in = new Class();
		in.b();
		AbstrationClass cl = (AbstrationClass)in;
		cl.b();
	}

}
