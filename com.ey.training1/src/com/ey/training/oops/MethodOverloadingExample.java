package com.ey.training.oops;

public class MethodOverloadingExample {

	//method overloading - same method name , different arguments /different signature
	//static polymorphism
	//compile polymorphism
	
	void sum() {
		System.out.println("no param method");
	}
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	void sum(int a, int b , int c) {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.sum();
		obj.sum(2, 3);
		obj.sum(1, 2, 3);
	}
	
	
}
