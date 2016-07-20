package com.sunil.java.util.map;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,String> tm=new TreeMap<>();
		
		tm.put("115", "sunil");
		tm.put("112", "sunil");
		tm.put("113", "sunil");
		tm.put("113", "sunil");
		
		for(String s:tm.keySet())
		{
			System.out.println(s);//display the elements in shorted order
		}
		

	}

}
