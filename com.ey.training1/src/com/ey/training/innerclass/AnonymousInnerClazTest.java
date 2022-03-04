package com.ey.training.innerclass;

public class AnonymousInnerClazTest {

	public static void main(String[] args) {
		
		AnonymousInner inner = new AnonymousInner() {

			@Override
			public void test() {
				System.out.println("This is anonymous inner class test() method");
			}
		};
		
		inner.test();
		
	}

}


abstract class AnonymousInner{
	
	public abstract void test();
	
}