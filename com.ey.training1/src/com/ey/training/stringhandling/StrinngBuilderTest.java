package com.ey.training.stringhandling;

public class StrinngBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		str.append("Java ");
		str.append("program ");
		str.append("language ").append("hello ").append("world");
		
		System.out.println(str);
		System.out.println(str.reverse());
		
		System.out.println(str.capacity());
		
		StringBuilder builder = new StringBuilder("my ");
		builder.append(" name ").append(" is").append(" pruhvu");
		
		System.out.println(builder);
	}

}
