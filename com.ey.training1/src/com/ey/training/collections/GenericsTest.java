package com.ey.training.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		/**
		List obj = new ArrayList<>();
		obj.add(10);
		obj.add("name");
		
		System.out.println(obj);
		
		int a = (int) obj.get(0);
		int b = (int) obj.get(1);  // type casting issue & maintain compile time type safety => generics  <>
		*/
		
//		List<Generic Type> obj = new ArrayList<>();
		
//		List<Integer> li = new ArrayList<>();
//		li.add(10);
//		li.add("name");  //maintain compile time type safety 
		
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		
		System.out.println(myList);
		
		List<String> myStrList = new ArrayList<>();
		myStrList.add("Java");
		myStrList.add("python");
		myStrList.add("VC++");
		
		System.out.println(myStrList);

	}

}
