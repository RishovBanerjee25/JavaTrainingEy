package com.ey.training.java8;

import java.util.StringJoiner;

public class StringgJoinerTest {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner("::","[","]");
		joiner.add("eleme");
		joiner.add("eleme");
		joiner.add("eleme");
		
		
		System.out.println(joiner);
	}

}
