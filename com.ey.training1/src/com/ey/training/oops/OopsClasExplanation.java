package com.ey.training.oops;

public class OopsClasExplanation {
	
	int a;  //code
	int b;  //code
	
	public OopsClasExplanation() {
		System.out.println("default constructor");
	}
	
	//is used to initialize the instance variables
	public OopsClasExplanation(int value1 , int value2) {//parameters /arguments
		//this is a keyword which is used to access currently activating class members
		this.a = value1;
		this.b = value2;
		
	}
	
	public int addData(int a , int b, String name) { 
		System.out.println(name);
		return 0;
	}
	
	public int mulData() {
		  int d=a*b;
		  return d;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	
}
