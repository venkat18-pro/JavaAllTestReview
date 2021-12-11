package test.array;

public class Array {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		
		a[0]=19;
		a[1]=39;
		a[2]=32;
		a[3]=92;
		
		for (int i = 0; i < 4; i++) {
			System.out.println(a[i]);
		}
		
		for (int i : a) {
			System.out.println(i);
			
		}
		
		int b[][] = new int[1][1];
		
		b[0][0] = 39;
		
		
		for (int[] is : b) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
		
	}
	
}
