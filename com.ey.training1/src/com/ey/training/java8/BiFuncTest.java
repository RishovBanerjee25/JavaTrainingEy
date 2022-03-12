package com.ey.training.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;

public class BiFuncTest implements BiFunction<List<String>, Set<String>, Integer>{

	public static void main(String[] args) {
		BiFuncTest obj = new BiFuncTest();
		Set<String> set = new HashSet<>();
		set.add("JRE"); set.add("DotNet");
		System.out.println(obj.apply(Arrays.asList("Java","Python","Jdk"), set));

	}

	@Override
	public Integer apply(List<String> strList, Set<String> strSet) {
		
		int totalLength = 0;
		
		for (String li : strList) {
			totalLength = totalLength + li.length();
		}
		
		for (String se : strSet) {
			totalLength = totalLength + se.length();
		}
		
		return totalLength;
	}

}
