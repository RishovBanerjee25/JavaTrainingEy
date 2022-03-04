package com.ey.training.statements;

public class LoopingStatements {

	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println("hello");
		}
		
		int add =0;
		for(int i=0;i<=11;i++) {
			add = add+i;
		}
		
		System.out.println("Sum of 11 numbers is :: "+add);
		
		int i=0;  //initialize
		
		while(i<=5) {  //condition
			System.out.println("Hello world");
			i++;  //increment or decrement ops
		}
		
//		do-while
		
		do {
			System.out.println("Hello world");
			i++;
		}while(i>5);
		
		
	}

}
