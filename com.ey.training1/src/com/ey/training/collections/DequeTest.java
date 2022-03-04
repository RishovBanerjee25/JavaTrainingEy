package com.ey.training.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {

		Deque<String> str = new ArrayDeque<>();
		str.add("java");
		str.add("python");
		str.add("vc++");

		str.push("C++");
		str.push("C#");

		System.out.println("peek :" +str.peek());

		for (String x : str) {
			System.out.println(x);
		}

		System.out.println("=============after peek ====================");

		System.out.println("pop :" +str.pop());

		for (String x : str) {
			System.out.println(x);
		}

		System.out.println("=============after pop again ====================");

		System.out.println("pop :" +str.pop());
		
		for (String x : str) {
			System.out.println(x);
		}

	}

}
