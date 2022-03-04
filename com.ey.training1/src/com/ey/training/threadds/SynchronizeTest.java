package com.ey.training.threadds;

public class SynchronizeTest {

	public static void main(String[] args) {
		
		SendMessage obj = new SendMessage();
		ThreaddSend t1 = new ThreaddSend("Thread1",obj);
		ThreaddSend t2 = new ThreaddSend("thread2", obj);
		t1.start();
		t2.start();

	}

}

class SendMessage {
	
	public void send(String message) {
		System.out.println("Sending message");
		System.out.println("Sent Message");
	}
}


class ThreaddSend extends Thread {
	
	String message;
	SendMessage sendMessage;
	
	public ThreaddSend(String msg, SendMessage sendMessage) {
		
		this.message = msg;
		this.sendMessage = sendMessage;
	}
	
	public void run() {
		
		synchronized(sendMessage) {
			
			sendMessage.send(message);
		}
	}
}