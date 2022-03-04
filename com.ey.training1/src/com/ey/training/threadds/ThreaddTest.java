package com.ey.training.threadds;

public class ThreaddTest {

	public static void main(String[] args) {
		
		ThreadRunTest t1 = new ThreadRunTest();
		t1.start();

	}

}

class ThreadRunTest extends Thread {
	
	public void run() {
		System.out.println("Thred call using Thread class");
	}
}