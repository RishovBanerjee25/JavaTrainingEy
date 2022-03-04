package com.ey.training.stringhandling;

public class StrinngEqualTest {

	public static void main(String[] args) {
		
		String str1 = "Java";
		
		String str2 = "Java";
		
		String str3 = new String("Java");
		
		// == (address)& equals()=> (content)
		System.out.println(str1 == str2);
		
		System.out.println(str1 == str3);
		
		System.out.println(str2 == str3);
		
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str1.equals(str3));
//		
//		System.out.println(str2.equals(str3));
	}

}
