package com.sunil.java.util.set;



import java.util.Iterator;

import java.util.TreeSet;

public class TreeSetTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> hs=new TreeSet<>();
		hs.add("sunil");
		hs.add("mrunalinee");
		hs.add("sunil");
		hs.add("gudu");
		
		/*Traverse using Iterator*/		
		
		  Iterator <String>hsIterator=hs.iterator();
		
		while(hsIterator.hasNext()){
			
			System.out.println(hsIterator.next());
				
	}
		
/*		Traverse using For Each(Java 5.0 feature)*/
		
		for(String s:hs)
		{
			System.out.println(s);
		}
		
		
	
	
		
		
	}
}
