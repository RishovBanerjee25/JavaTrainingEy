package com.ey.training.java8;

import java.util.function.Consumer;

public class ComsumerTest implements Consumer<String>{

	public static void main(String[] args) {
		
		ComsumerTest obj = new ComsumerTest();
		obj.accept("Hello");
	}

	@Override
	public void accept(String t) {
		System.out.println(t.length());
		System.out.println(t.contains("H"));
		System.out.println(t.concat(" world"));
		
	}
	

	
}
