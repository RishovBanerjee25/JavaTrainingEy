package com.ey.training.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		
		Enumeration obj = vec.elements();
		
		while(obj.hasMoreElements()) {
			System.out.println(obj.nextElement());
		}
		
	}

}
