package com.ey.training.oops;

public class MethodOverridingExample {
	//method overriding - same method name , same signature/same arguments.
	//runtime polymorphism
	//dynamic polymorphism
	
	public static void main(String[] args) {
		ICICI ic = new ICICI();
		System.out.println(ic.getRateOfIntertest());
		
		HDFC hd = new HDFC();
		System.out.println(hd.getRateOfIntertest());
	}
}
class Bank{
	int getRateOfIntertest() {
		return 0;
	}
}
class ICICI extends Bank{
	
	int getRateOfIntertest() {
		return 7;
	}
}
class HDFC extends Bank{
	
	int getRateOfIntertest() {
		return 10;
	}
}