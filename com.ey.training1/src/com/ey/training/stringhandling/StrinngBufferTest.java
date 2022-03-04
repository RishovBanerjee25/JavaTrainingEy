package com.ey.training.stringhandling;

public class StrinngBufferTest {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer();
		str.append("Java ");
		str.append("program ");
		str.append("language ").append("hello ").append("world").append(" HI");
		
		
		System.out.println(str);
		
		System.out.println(str.reverse());
		
		System.out.println(str.capacity());
	}

}
