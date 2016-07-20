package com.sunil.java.util.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
	ArrayList<String> ar=new ArrayList<>();
		
		ar.add("sunil");
		ar.add("sunil");
		ar.add("pinky");
		ar.add("anil");
		
		
		
		// Using For each 
		for(String s:ar)
		{
			System.out.println(s);
			
		}
		
		ar.remove("pinky");
		//Using Iterator
		System.out.println("Using Iterator");
		
		Iterator<String> ir=ar.iterator();
		
		
		
		while(ir.hasNext())
		{
			
			String sr=ir.next();
			System.out.println(sr);
		/*	if(sr.equals("pinky"))
			{
				ar.remove(sr);  this will not work properly
			}*/
		}
	}

}
