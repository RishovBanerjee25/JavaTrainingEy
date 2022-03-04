package com.ey.training.statements;

public class JumpStatements {

	public static void main(String[] args) {

		for(int i=0 ;i<=5; i++) {

			if(i==3) {
								break; //which is used to break the loop and skip all the next iterations.
			}
			System.out.println("value : "+i);
		}
		System.out.println("====================================================");
		for(int i=0 ;i<=5; i++) {

			if(i==3) {
								continue; // which is used to skip the current iteration and execute all the other iterations.
			}
			System.out.println("value : "+i);
		}
	}

}
