package com.ey.training.innerclass;

class OuterClaz {
	
	int a;
	
	void disp() {
		System.out.println("OuterClaz disp() method");
		
		InnerClaz obj = new InnerClaz();
		obj.test();
	}
	
	class InnerClaz{
		
		public void test() {
			System.out.println("This is a test() method inside Innerclaz");
		}
	}

}

public class OuterClazTest{
	public static void main(String[] args) {
		
		OuterClaz outObj = new OuterClaz();
		outObj.disp();
	}
}
