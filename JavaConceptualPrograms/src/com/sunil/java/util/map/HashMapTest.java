package com.sunil.java.util.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
	
	HashMap<String,String> hm=new HashMap<>();
		
		hm.put("100", "sunil");
		hm.put("101", "sunil2");
		hm.put("102", "sunil");
		hm.put("102", "sunil");
		
		//iterating map:  procedure 1
		System.out.println("1. iterating map:  using keySet and get Method");
		for(String s:hm.keySet())
		{
			System.out.println(s+" "+hm.get(s));
		}
		
		//iterating map:  procedure 2
		System.out.println("2. iterating map: using entrySet");
		Set<Entry<String, String>> entySet =hm.entrySet();
		for(Entry<String, String> e:entySet){
			
			System.out.println(e.getKey()+" "+e.getValue());
			
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
