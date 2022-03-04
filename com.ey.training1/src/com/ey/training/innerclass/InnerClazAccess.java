package com.ey.training.innerclass;

public class InnerClazAccess {

	public static void main(String[] args) {

		OuterCla outObj = new OuterCla();
		
		OuterCla.InnerCla innerObj = outObj.new InnerCla();
		
		innerObj.test();
		
		
	}

}

class OuterCla{
	
	int a = 10;
	
	void disp() {
		InnerCla obj = new InnerCla();
		obj.test();
	}
	
	class InnerCla{
		
		public void test() {
			System.out.println("Inner class test() method");
		}
	}
	
}
