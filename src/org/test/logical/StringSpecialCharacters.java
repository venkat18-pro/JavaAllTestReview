package org.test.logical;

public class StringSpecialCharacters {

	public static void main(String[] args) {
		
		String s = "Venkat123@gmail.com";
		String lc = "",uc = "",s1 = "",num = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char at = s.charAt(i);
			if(Character.isDigit(at))
				num = num + at;
			else if(Character.isUpperCase(at))
				uc = uc + at;
			else if(Character.isLowerCase(at))
				lc = lc + at;
			else 
				s1 = s1 + at;
			
		}
		
		System.out.println(lc);
		System.out.println(uc);
		System.out.println(s1);
		System.out.println(num);
		
		

	}

}
