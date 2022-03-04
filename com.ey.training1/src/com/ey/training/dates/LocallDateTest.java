package com.ey.training.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class LocallDateTest {

	public static void main(String[] args) {
				
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalDate date1 = date.minusDays(1);
		
		System.out.println(date1);
		
		LocalDate date2 = date.plusDays(1);
		

		System.out.println(date2);
		
		System.out.println(date.minusMonths(1));
		System.out.println(date.minusYears(1));
		
		
		//YYYY - MM - DD HH : MM : SS
		//YYYYMMDD
		//DDMMYYYY
		//D - M - yy
		
//		MM/dd/yyyy
//		dd-M-yyyy hh:mm:ss
//		dd MMMM yyyy
		
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String datee = sdf.format(new Date());
		System.out.println(datee);
		
		
		String pattern1 = "MM-dd-yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
		String datee1 = sdf1.format(new Date());
		System.out.println(datee1);
		
		System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(new Date()));
		
		System.out.println(new SimpleDateFormat("dd MMMM yyyy").format(new Date()));
		
		String patter = "EEEEE MMMMM yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat sd = new SimpleDateFormat(patter,new Locale("fr", "FR"));
		System.out.println(sd.format(new Date()));
		
		
		LocalDate dt = LocalDate.of(2019, 10, 19);
	    LocalDateTime dateTime = dt.atTime(1, 20, 30);
	    System.out.println(dateTime);
	    
	    LocalTime time = LocalTime.now();
	    System.out.println(time);
	    
	    System.out.println(time.minusHours(1));
	    
	    System.out.println(time.plusHours(2));
	    
	    ZoneId zonekol = ZoneId.of("Asia/Kolkata");
	    
	    
	    
	    ZoneId zoneSyd = ZoneId.of("Australia/Sydney");
	    
	    System.out.println(LocalTime.now(zonekol));
	    
	    System.out.println(LocalTime.now(zoneSyd));
	    
	    LocalDateTime current = LocalDateTime.now();
	    System.out.println("LocalDateTime now "+current);
	    
	    DateTimeFormatter format123 = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
	    
	    System.out.println(current.format(format123));
	    
	    LocalDateTime dat1 = LocalDateTime.of(2019, 10, 19, 9, 54);
		System.out.println(dat1);
		
		Date dt2 = new Date();
	    System.out.println(dt2);
	    
	    System.out.println(System.currentTimeMillis());
	    
	    System.out.println(new Date(System.currentTimeMillis()));
		
	}

}
