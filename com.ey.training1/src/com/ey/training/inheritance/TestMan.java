package com.ey.training.inheritance;

public class TestMan {

	public static void main(String[] args) {
		
		Man man = new Man();
		
		//man
		man.setAge(25);
		man.setGender('M');
		
		//person
		man.setHeight(5);
		man.setWeight(50);
		man.setTalk(true);
		man.setWalk(true);
		
		System.out.println(man.getAge());
		System.out.println(man.getGender());
		System.out.println(man.getHeight());
		System.out.println(man.getWeight());
		System.out.println(man.isTalk());
		System.out.println(man.isWalk());
		
	}

}
