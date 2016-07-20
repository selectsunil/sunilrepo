package com.sunil.java.util.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
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
