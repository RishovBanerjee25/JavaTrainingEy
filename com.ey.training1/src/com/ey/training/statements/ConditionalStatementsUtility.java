package com.ey.training.statements;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author prudhvi
 * @since 14-02-2022
 * ConditionalStatementsUtility class is used to explain conditional statements.
 *
 */
public class ConditionalStatementsUtility {

	public static void main(String[] args) {

		
		int a = 20 , b=10 ,c = 5 , d=25;


		if(a<b) {     
			System.out.println("a is greater than b");
			System.out.println("This is if conditional statement");
		}

		if(a<b) {
			System.out.println("a is not greater than b");
			System.out.println("This is if block conditional statement");
		} else {
			System.out.println("a is greater than b");
			System.out.println("This is else block conditional statement");
		}

		if(a>b) {
			System.out.println("a is greater than b");

			if(a>c) {
				System.out.println("a is greater than c");

				if(a>d) {

					System.out.println("a is greater than d");
				}else {
					System.out.println("a is not greater than d");
				}

			}else {
				System.out.println("a is not greater than c");
			}
		}

		if(a<b) {
			System.out.println("a is greater than b");
		}else if(a>c) {
			System.out.println("a is greater than c");
		}else if(a>d) {
			System.out.println("a is greater than d");
		}else {
			System.out.println("all the other cond. not satisfied , then else will be executed.");
		}

		switch("a") {

		case "X" :  System.out.println("this is X case");
		System.out.println("this is switch case");
		break;

		case "Y" :  System.out.println("this is Y case");
		System.out.println("this is switch case");
		break;

		case "Z" :  System.out.println("this is Z case");
		System.out.println("this is switch case");
		break;


		default  :  System.out.println("this is default case");
		System.out.println("this is switch case");
		break;

		}

		switch(1) {

		case 1:   
			break;

		case 2: 
			break;

		case 3:   
			break;

		default :  
			break;

		} 

		List<Integer> li = Arrays.asList(1,2,3,4,5,6);

		for (Integer x : li) {
			System.out.println(x);
		}

	}

}
