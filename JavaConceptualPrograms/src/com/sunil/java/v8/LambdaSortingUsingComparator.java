package com.sunil.java.v8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSortingUsingComparator {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("B");
		items.add("S");
		items.add("T");
		items.add("L");
		items.add("C");
		
		//Before Java 8
		/*
		Collections.sort(items, new Comparator<String>() {	
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return  o1.compareTo(o2);
			}	
			
		});
		
		for(String s:items) {
			System.out.println(s);
		}*/
		
		//After Java 8
		
		System.out.println("After java 8");		
		items=items.stream().sorted((a,b)-> a.compareTo(b)).collect(Collectors.toList());
		items.forEach(s->System.out.println(s));



	}

}
