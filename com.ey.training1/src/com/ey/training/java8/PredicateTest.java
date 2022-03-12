package com.ey.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("Java","Python","Jdk","JRE","DotNet");
		
		Predicate<String> predicate =  str -> str.startsWith("J");  // x -> x%2 == 0
		
		for (String element : strList) {
			
			if(predicate.test(element)) {
				System.out.println(element);
			}
		}
		
	}

}
