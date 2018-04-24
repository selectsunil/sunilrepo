package com.sunil.java.v8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class LocalDateApi {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date = dateFormat.parse("2012-12-24");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
		
		
		
		//After java 8
		
		LocalDate localDate = LocalDate.of(2012, 12, 24);
		
		System.out.println(localDate);
		
		
		//Before java 8
		
		Calendar cal = Calendar.getInstance(); 
		cal.setTime(new Date()); 
		cal.add(Calendar.DATE, 1);
		Date tomorrow = cal.getTime();
		System.out.println(tomorrow);
		
		
		//After java 8
		LocalDate tomorrow1 = LocalDate.now().plusDays(1);
		System.out.println(tomorrow1);


	}

}
