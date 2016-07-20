package com.sunil.java.util.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		
		
		
		hs.add("sunil");
		hs.add("mrunalinee");
		hs.add("sunil");
		hs.add("gudu");
		
		/*Traverse using Iterator*/		
		
		  Iterator hsIterator=hs.iterator();
		
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
