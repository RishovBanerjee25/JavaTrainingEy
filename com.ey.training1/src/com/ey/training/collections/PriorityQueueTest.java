package com.ey.training.collections;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<String> str = new PriorityQueue<>();
		
		str.add("java");
		str.add("python");
		str.add("vc++");
		
		System.out.println(str.peek());
		
		System.out.println("=================after peek ===============");
		System.out.println(str.poll());
		System.out.println("=================after poll ===============");
		
		for (String x : str) {
			System.out.println(x);
		}
		
		System.out.println("=================after poll ===============");
		System.out.println(str.poll());
		System.out.println("=================after poll ===============");
		
		for (String x : str) {
			System.out.println(x);
		}
		
	}

}
