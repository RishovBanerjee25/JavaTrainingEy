package com.ey.training.exceptions;

public class ExceptioTest {

	public static void main(String[] args) {
		
		int a = 10;
		
		String s = null;
		int ab[] = new int[4];  // 0,1,2,3
		
		try {
			System.out.println("my program started");
			
			System.out.println(s.length()); //nullpointer exception
			System.out.println(10/0);  //arithmetic exception
			
			ab[0]=1;
			ab[4]=2;  //arrayindexout of bound exception
			
			ThrwTest obj = new ThrwTest();
			obj.test(13);
			
			System.out.println("rest of code...1 ");
			
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
//		}catch(ArithmeticException e){
//			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("This is an optional bloack");
			System.out.println("close external db connections or any other");
		}
		System.out.println("rest of code... 2");
		
		System.out.println("rest of code...3 ");
		
		System.out.println("rest of code... 4");
	}

}
