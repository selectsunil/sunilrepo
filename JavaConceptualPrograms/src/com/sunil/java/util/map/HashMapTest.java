package com.sunil.java.util.map;

import java.util.Date;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
	
	HashMap<String,String> hm=new HashMap<>();
		
		hm.put("100", "sunil");
		hm.put("101", "sunil2");
		hm.put("102", "sunil");
		hm.put("102", "sunil");
		
		for(String s:hm.keySet())
		{
			System.out.println(s+" "+hm.get(s));
		}

	
		
		hm.clear();
		
		hm.put("303","xyz");
		
		for(String s:hm.keySet())
		{
			
		System.out.println(s+" "+hm.get(s));	
		}
		
		HashMap<Integer,String> hm1=new HashMap<>();
		
		hm1.put(123, "int value");
		hm1.put(134, "int value");
		hm1.put(133, "int value");
		hm1.put(133, "int value2");
		
		for(Integer s:hm1.keySet())
		{
			
		System.out.println(s+" "+hm1.get(s));	
		}
		
		
HashMap<Date,String> hm2=new HashMap<>();
		
		hm2.put(new Date(), "int value");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hm2.put(new Date(), "int value");
		
		
		for(Date s:hm2.keySet())
		{
			
		System.out.println(s+" "+hm2.get(s));	
		}
		

	}

}
