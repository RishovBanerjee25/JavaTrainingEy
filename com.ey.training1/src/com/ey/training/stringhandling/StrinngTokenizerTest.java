package com.ey.training.stringhandling;

import java.util.StringTokenizer;

public class StrinngTokenizerTest {

	public static void main(String[] args) {
		
		String s = "java is a program lang";
		System.out.println(s);
		
		//delimeter - special character
		StringTokenizer token = new StringTokenizer("java is a program lang", " ");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		System.out.println("=======================");
		StringTokenizer token1 = new StringTokenizer("2022*02*17", "*");
		
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
	}

}
