package com.ey.training.accessmod;

public class StaticUtilization {
	
	 final int a =10;
	
	 static {
		System.out.println("This is a static block");
	}
	
	
	public static void main(String[] args) {
		System.out.println("HEllo");
		
		StaticUtilization.myStaticMethod(); 
		
		
	}
	
	static void myStaticMethod() {
		
		System.out.println("static method");
	}

}
