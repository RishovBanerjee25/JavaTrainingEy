package com.ey.training.dates;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		System.out.println(cal.getTime());
		
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
