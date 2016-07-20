package com.sunil.java.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateAndCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//How to get current Date?
		System.out.println("Today's Date:"+new Date());
		System.out.println("Today's Date From Calender:"+Calendar.getInstance().getTime());
		
			
		//How to format a  Date?
		System.out.println("Today's Date formated: "+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
		System.out.println("Today's Date formated: "+new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()));
		System.out.println("Today's Date formated: "+new SimpleDateFormat("dd/mm/yyyy").format(new Date()));
		System.out.println("Today's Date formated: "+new SimpleDateFormat("hh*mm#ss").format(new Date()));
		System.out.println("Today's Date formated: "+new SimpleDateFormat("HH:MM:ss").format(new Date()));
		System.out.println("Today's Date formated: "+new SimpleDateFormat("DD MM YY").format(new Date()));
		System.out.println("Today's Date formated: "+new SimpleDateFormat("EEEEEE dddd MMM").format(new Date()));
		
		System.out.println("Today's Calender Date formated: "+new SimpleDateFormat("EEEEEE dddd").format(Calendar.getInstance().getTime()));
		
		
		//How to create a Date object according to specific input  format
				try {
					System.out.println("Created custom Date:"+new SimpleDateFormat("dd/MMM/yyyy hh.mm.ss").parse("26/May/2014 05.20.55"));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
		//How to get difference between 2 dates
				SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy hh.mm.ss");
				
				try {
					Date d1=format.parse("23/05/2014 08.25.55");
					Date d2=format.parse("23/06/2014 08.27.55");
					
					long diff = d2.getTime() - d1.getTime();
					 
					long diffSeconds = diff / 1000 % 60;
					long diffMinutes = diff / (60 * 1000) % 60;
					long diffHours = diff / (60 * 60 * 1000) % 24;
					long diffDays = diff / (24 * 60 * 60 * 1000);
					
					System.out.println(" Difference between Dates :");
		 
					System.out.print(diffDays + " days, ");
					System.out.print(diffHours + " hours, ");
					System.out.print(diffMinutes + " minutes, ");
					System.out.print(diffSeconds + " seconds.");
					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		//Can we try without catch
				
				try{
					
				}
				finally{
					
				}
		
	}

}
