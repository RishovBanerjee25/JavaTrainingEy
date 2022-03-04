package com.ey.training.threadds;

public class RunnableIntfcTest {

	public static void main(String[] args) {
		
		RunnablTest rt = new RunnablTest();
		Thread t = new Thread(rt);
		t.start();
	}

}

class RunnablTest implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Run method call using Runnable interface");
	}
	
}