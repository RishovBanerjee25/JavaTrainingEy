package com.ey.training.basics;

public class SampleProgramAccessor {

	public static void main(String[] args) {
		//object for SampleProgram class
		//using new operator you can create a object for a class.
		//classname obj = new classname();
		//(.) member operator which is used to access members using object
		//Object is the top class for all the classes in java.
		
		SampleProgram obj = new SampleProgram();
		obj.addTwoValues();
		obj.subTwoValues();
		
		
//		obj = null; //unused objects
	}
}
