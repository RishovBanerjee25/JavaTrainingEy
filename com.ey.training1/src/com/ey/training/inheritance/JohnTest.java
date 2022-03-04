package com.ey.training.inheritance;

public class JohnTest {

	public static void main(String[] args) {
	   int a = 10;
		John john = new John();
		john.setAge(25);
		john.setHeight(5);
		john.setWeight(50);
		john.setGender('M');
		john.setCarNumber("1234");
		john.setTalk(true);
		john.setWalk(true);
		
		
		
		System.out.println(john.getCarNumber());
		System.out.println(john.getHeight());
		System.out.println(john.getWeight());
		System.out.println(john.getGender());
		System.out.println(john.isTalk());
		System.out.println(john.isWalk());
	}

}
