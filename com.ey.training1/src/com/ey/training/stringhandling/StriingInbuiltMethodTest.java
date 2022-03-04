package com.ey.training.stringhandling;

public class StriingInbuiltMethodTest {

	public static void main(String[] args) {
		
		String str = "Java Programming";
//					  0123456789
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5,9));
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('P'));
		
		System.out.println(str.lastIndexOf('m'));
		
		System.out.println(str.length());
		
		System.out.println(str.replace('m', 'P'));
		
		System.out.println(str.isEmpty());
		
	}

}
