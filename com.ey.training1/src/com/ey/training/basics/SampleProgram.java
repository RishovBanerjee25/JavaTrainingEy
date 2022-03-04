package com.ey.training.basics;

public class SampleProgram {

	// class - combination of member methods & variables.
	//object - if you want access members of a class , we are going to have Object created for that class.
	
	
	//variables
	int a = 10;   //global variables
	int b = 20;
	
	
	//methods -  + , - , * , / ,%
	public void addTwoValues() {
		int c = a+b;  //local variables
		System.out.println("addition of two numbers is :: " + c);
	}
	
	public void subTwoValues() {
		
		int d = b-a;
		System.out.println("sub of two given numbers is ::" +d);
	}
	
	
	
}
