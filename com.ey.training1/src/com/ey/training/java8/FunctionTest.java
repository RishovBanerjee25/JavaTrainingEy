package com.ey.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest implements Function<List<String>, List<Integer>>{

	public static void main(String[] args) {
		FunctionTest obj = new FunctionTest();
		System.out.println(obj.apply(Arrays.asList("Java","Python","Jdk","JRE","DotNet")));
		

	}

	@Override
	public List<Integer> apply(List<String> strList) {
		
		List<Integer> strLengthList = new ArrayList<>();
		
		for (String strElement : strList) {
			strLengthList.add(strElement.length());
		}
		
		
		return strLengthList;
	}

}
