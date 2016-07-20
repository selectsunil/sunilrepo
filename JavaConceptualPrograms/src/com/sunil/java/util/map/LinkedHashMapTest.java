package com.sunil.java.util.map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
	
		LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
		
		lhm.put("115", "222");
		lhm.put("112", "222");
		lhm.put("113", "222");
		
		for(String s:lhm.keySet())
		{
			System.out.println(s); //displays insertion order
		}		
		
	}

}
