package com.ey.training.oops;

public class TestObjUtilizer {
	
	public static void main(String[] args) {
		
		
		OopsClasExplanation obj = new OopsClasExplanation();
		
		
//		OopsClasExplanation obj2 = new OopsClasExplanation(100, 200);  //constructor injection
		
		obj.setA(10);   //setter injection
		obj.setB(20);
		
		int a = obj.addData(10,17,"prudhvi");//caller
		int b = obj.mulData();
		
		System.out.println( a   + " - "+ b);
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
		
	}

}
