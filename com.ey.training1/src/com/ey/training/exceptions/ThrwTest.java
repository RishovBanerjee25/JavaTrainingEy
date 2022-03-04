package com.ey.training.exceptions;

public class ThrwTest {

	public static void main(String[] args) throws InvalidAgeCustomException {

		int age = 13;

//		try {  //dev1 
			ThrwTest obj = new ThrwTest();
			obj.test(age);  //caller
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}

		System.out.println("rest of code ...2");

		System.out.println("rest of code ...3");

	}

//	public void test(int age) throws IllegalArgumentException{  //callee  //dev2
	public void test(int age) throws InvalidAgeCustomException {

		if(age<15) {
			throw new InvalidAgeCustomException("Age is not eligible for Voting");
		}

		System.out.println("rest of code ...1");
	}

}
