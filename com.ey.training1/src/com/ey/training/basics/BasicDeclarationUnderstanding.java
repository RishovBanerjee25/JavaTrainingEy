package com.ey.training.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class BasicDeclarationUnderstanding {

	public static void main(String[] args) throws IOException {
		//static declarations
//		int a =10;
//		int b = 20;
		//Stream - flow of bytes -40 -> 010101001
		int a;
		int b;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(isr);
		
		System.out.println("Enter a value");
		a = Integer.parseInt(buffer.readLine());
		System.out.println("Enter b value");
		b = Integer.parseInt(buffer.readLine());
		int c = a+b;
		System.out.println("Sum of a + b is :" +c);
		
	}

}
