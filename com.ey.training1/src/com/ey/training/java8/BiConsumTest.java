package com.ey.training.java8;

import java.util.function.BiConsumer;

public class BiConsumTest implements BiConsumer<String, String>{

	public static void main(String[] args) {
		BiConsumTest obj = new BiConsumTest();
		obj.accept("Hello", " World");
		
	}

	@Override
	public void accept(String t, String u) {
		
		System.out.println(t.concat(u));
		
		System.out.println(t.concat(u).length());
		
	}

}
