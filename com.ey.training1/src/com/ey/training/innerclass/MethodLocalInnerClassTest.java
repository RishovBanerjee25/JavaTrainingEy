package com.ey.training.innerclass;

public class MethodLocalInnerClassTest {

	public static void main(String[] args) {
		OuterDemo outerDemoObj = new OuterDemo();
		outerDemoObj.testMethodLocal();
	}
}

class OuterDemo{
	
	void testMethodLocal() {
		
		int a = 10;  
		
		class MethodLocalInnerDemo{
			
			public void disp() {
				System.out.println("This is a Method Local Inner class call..");
			}
		}
		
		MethodLocalInnerDemo methodLocalInnerDemoObj = new MethodLocalInnerDemo();
		methodLocalInnerDemoObj.disp();
		
	}
	
	
}
